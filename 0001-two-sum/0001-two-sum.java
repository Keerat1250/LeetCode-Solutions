class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             return new int[] {i,j};
                   
        //         }
        //     }
        // }
        // return new int[]{};
      

      HashMap<Integer, Integer> map=new HashMap<>();
      int ans[]=new int[2];
      for(int i=0;i<nums.length;i++)
      {
        int remsum=target-nums[i];
        if(map.containsKey(remsum)==false)
        {
            map.put(nums[i],i);
        }
        else
        {
            int indexPrevious=map.get(remsum);
            ans[0]=indexPrevious;ans[1]=i;
        }
      }
        
        return ans;
    }
}