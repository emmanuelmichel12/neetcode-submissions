class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] stringArr = blocks.toCharArray();
        int left = 0;
        int count = 0;
        int finalVal = 1000;

        for(int right = k - 1; right < stringArr.length; right++)
        {
            int check = left;
            while(check <= right)
            {
                if(stringArr[check] == 'W')
                {
                    count++;
                }

                check++;
            }

            if(count < finalVal)
            {
                finalVal = count;
            }

            count = 0;
            left++;
        }
        return finalVal;
    }
}