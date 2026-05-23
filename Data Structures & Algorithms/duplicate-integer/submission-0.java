class Solution {
    public boolean hasDuplicate(int[] nums) {
       
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
               int temp = nums[i];
               if(temp == nums[j])
               {
                    return(true);
               }
            }
        }return(false);
    }
}   