class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        if(sArr.length == 0)
        {
            return true;
        }
        int count = 0;
        int top = 0;
        int bottom = 0;
        while(bottom < tArr.length)
        {
            if(count == sArr.length - 1)
            {
                return true;
            }

            if(tArr[bottom] == sArr[top])
            {
                count++;
                top++;
            }

            bottom++;
        }

      return false;  
    }
}