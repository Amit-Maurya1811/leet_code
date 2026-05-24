class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]<=0||set.contains(nums[i]))
            continue;
            else
            {
                if(c==nums[i])
                c++;
                else
                return c;
            }
            set.add(nums[i]);
        }

        return c;
    }
}