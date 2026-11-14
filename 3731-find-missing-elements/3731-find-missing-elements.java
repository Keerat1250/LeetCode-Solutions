class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // ArrayList<Integer> list=new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=nums[0];i<=nums[nums.length-1];i++)
        // {
        //     list.add(i);
        // }
        // for(int num:nums)
        // {
        //     list.remove(Integer.valueOf(num));
        // }
        // return list;

       int min=nums[0];
       int max=nums[0];
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums)
       {
        if(num<min)
        {
            min=num;
        }
        if(num>max)
        {
            max=num;
        }
        set.add(num);
       }
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=min;i<max;i++)
       {
        if(!set.contains(i))
        {
            list.add(i);
        }
       }
       return list;

       


      
        

        
      
       

        
    }
}