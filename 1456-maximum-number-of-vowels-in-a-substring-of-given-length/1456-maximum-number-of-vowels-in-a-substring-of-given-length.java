class Solution {
    public int maxVowels(String s, int k) {
        int f=0,max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            if(vowel(s.charAt(i)))
            f++;
        }
        int left=0;
        max=f;
        while(left+k<s.length())
        {
            
            if(vowel(s.charAt(left)))
            f--;
            if(vowel(s.charAt(left+k)))
            f++;
            if(f>max)
            max=f;
            left++;

        }
        return max;

        
    }
    boolean vowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        return true;
        else 
        return false;
    }
}