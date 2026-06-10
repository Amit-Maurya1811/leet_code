class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length,c=0;
        for(int i=0;i<len;i++)
        {
            if(flowerbed[i]==0)
            {
                boolean left=(i==0||flowerbed[i-1]!=1);
                boolean right=(i==len-1||flowerbed[i+1]!=1);

                if(left && right)
                {
                    flowerbed[i]=1;
                    c++;
                }
            }
        }
        if(c>=n)
        return true;
        else
        return false;
    }
}