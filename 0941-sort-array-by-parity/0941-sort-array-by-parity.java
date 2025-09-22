class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        if(nums.length==1)
        {
            return nums;
        }    
        int l=0,r=nums.length-1;
        
        while(l<r)
        {
            if(nums[l]%2!=0)
            {
                if(nums[r]%2==0)
                {
                    int t=nums[l];
                    nums[l]=nums[r];
                    nums[r]=t;
                    l++;
                    r--;
                }
                else
                {
                    r--;
                }
            }
            else
            {
                l++;
            }
        }
       
        return nums;
    }
}