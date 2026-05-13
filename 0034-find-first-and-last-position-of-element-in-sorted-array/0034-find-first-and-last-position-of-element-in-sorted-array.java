class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=0,i=0;
        int[] result={-1,-1};
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>target)
            break;
            if(nums[i]==target)
            f++;
            if(f==1)
            {
                result[0]=i;
                result[1]=i;
            }
            if(f>1)
            result[1]=i;
        }
        return result;
    }
}