class Solution {
    public int searchInsert(int[] nums, int target)
    {
        int l=0,h=nums.length-1;
        int index=nums.length;
        while(l<=h)
        {
            int mid=(l+h)/2;

            if(nums[mid]>=target)
            {
                index=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }    
        return index;
    }
}