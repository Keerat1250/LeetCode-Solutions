class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=nums[0];i<=nums[nums.length-1];i++)
        {
            list.add(i);
        }
        for(int num:nums)
        {
            list.remove(Integer.valueOf(num));
        }
        return list;
      
        

        
      
       

        
    }
}