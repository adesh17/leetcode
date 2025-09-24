class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
    
        int left=0,i=0;
        int maxCount=0;
        while(left<nums.length)
        {
            if(nums[left]==0)
            {
                left++;
            }
            else
            {
                int temp=left,count=0;
                while(temp < nums.length && nums[temp] != 0)
                {
                    count++;
                    temp++;
                }
                maxCount=Math.max(count,maxCount);
                left=temp+1;
            }
        } 
        return maxCount;   
    }
}