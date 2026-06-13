class Solution {
    public int longestSubarray(int[] nums) {
        int zeros=0,max=0,left=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            zeros++;

            while(zeros>1)
            {
                if(nums[left]==0)
                zeros--;
                left++;
            }

            max=Math.max(max,(i-left)+1-zeros);
        }
        if(zeros==0)
        return max-1;
        else
        return max;
    }
}