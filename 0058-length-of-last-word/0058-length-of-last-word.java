class Solution {
    public int lengthOfLastWord(String s) {
        int f=0,worddetected=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch==' '&&worddetected==0)
            {
                continue;
            }
            else
            {
                worddetected=1;
            }
            if(ch==' '&&worddetected==1)
            {
                return f;
            }
            f++;
        }
        return f;
    }
}