class Solution {
    public int search(int[] nums, int target) {
        int f=0, i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        return i;
        else 
        return -1;
    }
}