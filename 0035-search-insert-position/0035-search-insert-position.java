class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int index=0,i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                index=i;
                break;
            }
            else if(nums[i]>target)
            {
                index=i;
                break;
            }
        }
        if(i==nums.length)
        {
            return i;
        }
        else
        {
            return index;
        }
        
    }
}