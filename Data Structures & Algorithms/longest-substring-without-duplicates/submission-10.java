class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
        {
            return 0;
        }
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;
        int finalCount = 0;
        HashSet<Character> charSet = new HashSet<>();

        while(right < arr.length)
        {
            while(charSet.contains(arr[right]))
            {
                charSet.remove(arr[left]);
                left++;
            }

        charSet.add(arr[right]);
        int count = right - left + 1;

        if (count > finalCount) {

            finalCount = count;

        }
        right++;
        }
        return finalCount;
    }
}
