class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxsub =  nums[0];
        for(int i =1;i<nums.length;i++){
            max = Math.max(nums[i],max+nums[i]);
            maxsub = Math.max(maxsub,max);
        }
        return maxsub;
    }
}