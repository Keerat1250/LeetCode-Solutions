class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // TreeSet<Integer> set=new TreeSet<>();
        // ArrayList<Integer> list=new ArrayList<>();
        // int max=nums[0];
        // int min=nums[0];
        // for(int num:nums)
        // {
        //     if(num<min)
        //     {
        //         min=num;
        //     }
        //     if(num>max)
        //     {
        //         max=num;
        //     }
        //     set.add(num);
        // }
        // for(int i=min;i<max;i++)
        // {
        //     if(!set.contains(i))
        //     {
        //         list.add(i);
        //     }
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