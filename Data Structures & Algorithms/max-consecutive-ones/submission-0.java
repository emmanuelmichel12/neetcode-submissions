class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int finalCount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                count++;
            }
            else
            {
                if(count > finalCount)
                {
                    finalCount = count;
                }
                count = 0;
            }
        }

        if(count > finalCount)
                {
                    finalCount = count;
                }

        return finalCount;
    }
}