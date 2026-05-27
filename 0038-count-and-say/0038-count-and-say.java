class Solution {
    public String countAndSay(int n) {
        int f=1;
        if(n==1)
        return "1";
        else
        {
            String s=countAndSay(n-1);
            String ns="";
            int l=s.length();
            for(int i=0;i<l;i++)
            {
                if(i!=l-1&&s.charAt(i)==s.charAt(i+1))
                {
                    f++;
                }
                else
                {

                    ns=ns+f+s.charAt(i);
                    f=1;
                }
            }
            return ns;
        }
    }
}