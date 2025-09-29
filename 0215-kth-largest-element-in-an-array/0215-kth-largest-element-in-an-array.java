class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> minhip=new PriorityQueue<Integer>();

        for(int num : nums)
        {
            minhip.add(num);
            if(minhip.size()>k)
            {
                minhip.poll();
            }
        }

        return minhip.peek();
    }
}