class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num:freq.keySet())
        {
            if(freq.get(num)>arr.length/4)
            {
                return num;
            }

            
        }
        return -1;

        
    }
}