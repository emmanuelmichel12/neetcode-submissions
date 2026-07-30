class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int start = k - 1;
        int min = nums[start] - nums[left];

        for(int right = start; right < nums.length; right++)
        {
            int check = nums[right] - nums[left];
            if(check < min)
            {
                min = check;
            }
            left++;
        }

        return min;
    }
}