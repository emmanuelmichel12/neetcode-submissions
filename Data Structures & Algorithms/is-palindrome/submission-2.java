class Solution {
    public boolean isPalindrome(String s) {

        if(s.length() <= 0)
        {
            return true;
        }
        char[] sArr = s.toCharArray();
        int x = 0;
        int y = sArr.length - 1;

        while(x <= y)
        {
            if(!Character.isLetterOrDigit(sArr[x]))
            {
                while(x < y && !Character.isLetterOrDigit(sArr[x]))
                {
                    x++;
                }
            }

            if(!Character.isLetterOrDigit(sArr[y]))
            {
                while(x < y && !Character.isLetterOrDigit(sArr[y]))
                {
                    y--;
                }
            }
            
            char left = Character.toLowerCase(sArr[x]);
            char right = Character.toLowerCase(sArr[y]);
            if(left == right)
            {
            x++;
            y--;
            } else {
                return false;
            }
        }

        return true;
    }
}
