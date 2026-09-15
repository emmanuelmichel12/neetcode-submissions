class Solution {
    public int findPeakElement(int[] nums) {

        int index = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left < right)
        {
            int mid = (left + right) / 2;
            int plus = mid + 1;

            if(nums[mid] < nums[plus])
            {
                left = plus;
                index = plus;
            }
            else
            {
                index = mid;
                right = mid;
            }
        }

        return index;
    }
}