class Solution {
    public int findPeakElement(int[] nums)
    {
        int index=0,max=nums[0];

        if(nums.length==2)
        {
            if(nums[1]>nums[0])
            {
                return 1;
            }
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                index=i;
            }
        }

        return index;
    }
}