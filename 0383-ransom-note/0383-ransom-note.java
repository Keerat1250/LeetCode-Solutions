class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> freq= new HashMap<>();
       
           

            for(int i=0;i<magazine.length();i++)
            {
                char ch=magazine.charAt(i);

                freq.put(ch,freq.getOrDefault(ch,0)+1);
            }
            

        
        for(int i=0;i<ransomNote.length();i++)
        {
            char ab=ransomNote.charAt(i);
            if(!freq.containsKey(ab)|| freq.get(ab)==0)
            {
                return false;
            }
            freq.put(ab,freq.get(ab)-1);
        }
      return true;
    }
}