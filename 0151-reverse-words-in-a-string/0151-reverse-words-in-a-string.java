class Solution {
    public String reverseWords(String s) {
        ArrayList<String> rev=new ArrayList<>();
        StringBuilder wd=new StringBuilder();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if((ch==' ')&&wd.length()!=0)
            {
                rev.add(wd.toString());
                wd.delete(0,wd.length());
            }
            else if(ch!=' ')
            {
                wd.append(ch);
            }
        }
        if(wd.length()!=0)
        rev.add(wd.toString());
        Collections.reverse(rev);
        return String.join(" ",rev);
    }
}