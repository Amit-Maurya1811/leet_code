class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int  right=height.length-1;
        int  max=Integer.MIN_VALUE;
        int area=0;
        while(left<right)
        {
            area=Integer.min(height[left],height[right])*(right-left);
            if(area>max)
            max=area;
            if(height[left]<height[right])
            left++;
            else
            right--;
        }
        return max;
        
    }
}