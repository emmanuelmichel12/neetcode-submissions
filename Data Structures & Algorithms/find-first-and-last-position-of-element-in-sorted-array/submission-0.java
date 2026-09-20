class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] range = new int[2];
        range[0] = -1;
        range[1] = -1;
        int left = 0;
        int right = nums.length - 1;
        int hold = 0;


        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(nums[mid] == target)
            {
                range[1] = mid;
                left = mid + 1;
            }
            else if(nums[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

         left = 0;
         right = nums.length - 1;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(nums[mid] == target)
            {
                range[0] = mid;
                right = mid - 1;
            }
            else if(nums[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }


        return range;
        
    }
}