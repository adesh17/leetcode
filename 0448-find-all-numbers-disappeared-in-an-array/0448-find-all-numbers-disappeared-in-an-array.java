class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> ans=new ArrayList<>();  
       Arrays.sort(nums);
       int i=1;
       int flag=0;
       while(i <= nums.length)
       {
           int low=0;
           int high=nums.length-1;
             
            while(low<=high)
            {
                int mid = (high+low)/2;
                flag = 0;
                if(nums[mid]==i)
                {
                    flag=1;
                    break;
                }
                else if(nums[mid]<i)
                {
                    low = mid + 1;
                }
                else 
                {
                    high = mid -1;
                }
            }

            if(flag == 1)
            {
                i++;
            }
            else
            {
                ans.add(i);
                i++;
            }
       }
       return ans;

    }
}