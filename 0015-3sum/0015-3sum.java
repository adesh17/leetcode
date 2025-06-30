class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);

        List<List<Integer>> list;
        Set<List<Integer>> set=new HashSet<>();
        int i,k;

        for(int j=1;j<nums.length-1;j++)
        {
            i=0;
            k=nums.length-1;

            while(i<j && k>j)
            {
                if(nums[i]+nums[j]+nums[k]>0)
                {
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]<0)
                {
                    i++;
                }
                else if(nums[i]+nums[j]+nums[k]==0) 
                {
                    List<Integer>ans=new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    set.add(ans);
                    i++;
                }
            }
        }

        list=new ArrayList<>(set);
        return list;
    }
}