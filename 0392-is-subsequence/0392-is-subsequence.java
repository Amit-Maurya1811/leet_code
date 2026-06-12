class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        int j=0;
        for(int i=0;i<tl;i++)
        {
            if(j<sl&&t.charAt(i)==s.charAt(j))
            {
                j++;
            }
        }
        if(j==sl)
        return true;
        else
        return false;
    }
}