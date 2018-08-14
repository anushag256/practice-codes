/*String Compression - Compress String "aabbbcccc" to "a2b3c4"*/

public class Solution {
    public String compress(char[] chars) {
        int count = 1;
        String fnal = new String();
        int i;
        for(i=0; i<chars.length-1; i++)
        {
            if(chars[i] == chars[i+1])
            {
                count = count+1;
            }
            else
            {
                fnal = fnal + chars[i] + count;
                count = 1;
            }
        }
        if(chars[i] == chars[i-1])
        {
            fnal = fnal + chars[i] + count;
        }
        else
        {
            fnal = fnal + chars[i] + "1";
        }
        return fnal;
    }
    public static void main(String args[])
    {
        String str = "aabbbcccc";
        Solution sol = new Solution();
        char[] chars = str.toCharArray();
        System.out.println(" = " + sol.compress(chars));
    }
}
