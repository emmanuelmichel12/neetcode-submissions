class Solution {
    public String mergeAlternately(String word1, String word2) {

        int len = word1.length() + word2.length();

        char[] newArr = new char[len];
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int i = 0;
        int j = 0;
        int k = 0;
        
        while( i < arr1.length && j < arr2.length)
        {
            newArr[k] = arr1[i];
            k++;
            i++;

            newArr[k] = arr2[j];
            k++;
            j++;
        }

        while(i < arr1.length)
        {
            newArr[k] = arr1[i];
            k++;
            i++;
        }

        while(j < arr2.length)
        {
            newArr[k] = arr2[j];
            k++;
            j++;
        }

        return new String(newArr);
    }
}