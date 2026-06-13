class Solution {
    public int pivotIndex(int[] nums) {
        int[] left=new int[nums.length];
        left[0]=0;
        int right;
        int total=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            total=total+nums[i];
            left[i]=nums[i-1]+left[i-1];
        }
        right=total;
        for(int j=0;j<nums.length;j++)
        {
            right=right-nums[j];
            if(right==left[j])
            return j;
        }
        return -1;
    }
}