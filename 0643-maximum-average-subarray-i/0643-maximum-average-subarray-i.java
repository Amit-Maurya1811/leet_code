class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0.0D,max=0.0D;
        int left=0,sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        max=(double)sum/k;
        while(left+k<nums.length)
        {
            avg=(double)sum/k;
            if(avg>max)
            max=avg;
            sum=sum-nums[left]+nums[left+k];
            left++;
        }
        avg=(double)sum/k;
            if(avg>max)
            max=avg;
        return max;
    }
}