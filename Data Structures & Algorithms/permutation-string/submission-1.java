class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] string1 = s1.toCharArray();
        char[] string2 = s2.toCharArray();
        int left = 0;

        if(string1.length > string2.length)
        {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(int i = 0; i < string1.length; i++)
        {
            map.put(string1[i], map.getOrDefault(string1[i], 0) + 1);
        }

        for(int i = 0; i < string1.length; i++)
        {
            window.put(string2[i], window.getOrDefault(string2[i], 0) + 1);
        }

        if(map.equals(window))
        {
            return true;
        }

        for(int right = string1.length; right < string2.length; right++)
        {
            window.put(string2[left], window.get(string2[left]) - 1);
            if(window.get(string2[left]) == 0 )
            {
                window.remove(string2[left]);
            }
            left++;
            window.put(string2[right], window.getOrDefault(string2[right], 0) + 1);

            if(map.equals(window))
            {
                return true;
            }
        }
     return false;   
    }
}
