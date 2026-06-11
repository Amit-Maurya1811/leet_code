class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int len=ch.length;
        int left=0,right=len-1;
        while(left<right)
        {
            while(left<right&&!isVowel(ch[left]))
            {
                left++;
            }
            while(left<right&&!isVowel(ch[right]))
            {
                right--;
            }
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
    boolean isVowel(char c)
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
            else 
            return false;
        }
}