class Solution {
    public int compress(char[] chars) {
        int l=chars.length;
        int index=0;
        int i=0;

        while(i<l)
        {
            char current=chars[i];
            int count=0;
            while(i<l&&current==chars[i])
            {
                count++;
                i++;
            }
            chars[index++]=current;
            if(count>1)
            {
                String s=String.valueOf(count);
                
                for(char c:s.toCharArray())
                {
                    chars[index]=c;
                    index++;
                }
            }

        }
        return index;
        
    }
}