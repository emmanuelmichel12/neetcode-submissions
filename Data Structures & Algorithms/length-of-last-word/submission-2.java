class Solution {
    public int lengthOfLastWord(String s) {
        char[] stringArr = s.toCharArray();
        int count = 0;
        int left = 0;
        int lastWord = 0;

        while(left < stringArr.length)
        {
            if(Character.isWhitespace(stringArr[left]))
            {
                if(count > 0)
                {
                lastWord = count;
                count = 0;
                }
            }
            else
            {
                count++;
            }

            left++;

        }

        if(count > 0)
        {
            lastWord = count;
        }

        return lastWord;
    }
}