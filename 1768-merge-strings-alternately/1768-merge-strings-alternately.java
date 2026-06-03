class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int a=0,b=0,i=0;
        int m=word1.length();
        int n=word2.length();
        while(a<m||b<n)
        {
            if(i%2==0&&a<m)
            {
                s.append(word1.charAt(a));
                a++;
            }
            else if(i%2!=0&&b<n)
            {
                s.append(word2.charAt(b));
                b++;
            }
            i++;
        }
        return s.toString();
    }
}