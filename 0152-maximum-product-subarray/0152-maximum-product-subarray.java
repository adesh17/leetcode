class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int maxsub =  nums[0];
        int min = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = max;
                max = min;
                min =  temp;
            }
            max = Math.max(nums[i],max*nums[i]);
            maxsub = Math.max(maxsub,max);
            min = Math.min(nums[i],min*nums[i]);
        }
        return maxsub;
    }
}
