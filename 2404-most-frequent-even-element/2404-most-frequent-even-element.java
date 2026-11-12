class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        Arrays.sort(nums);
        for(int num:nums)
        {
            
            freq.put(num,freq.getOrDefault(num,0)+1);
            
        }
        int max=-1;
        int ele=-1;

        for(int num:nums)
        {
            if(num%2==0)
            {
                if(freq.get(num)>max)
                {
                    max=freq.get(num);
                    ele=num;
                }

            }
        }
        return ele;
   
        
    }
}