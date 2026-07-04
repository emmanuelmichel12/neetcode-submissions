class Solution {
    public int findMin(int[] nums) {
        int min = Arrays.stream(nums).max().getAsInt();
        int left = 0;
        int right = nums.length - 1;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(nums[mid] < min)
            {
                min = nums[mid];
            }

            if(nums[left] > nums[mid])
            {
                if(nums[left] > nums[right])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            else
            {
                if(nums[mid] > nums[right])
                {
                    //right = mid - 1;
                    left = mid + 1;
                }
                else
                {
                    //left = mid + 1;
                    right = mid - 1;
                }
            }
        }

      return min;  
    }
}

/*
while(left <= right)
        {
            int mid = (left + right) / 2;

            if(nums[mid] < min)
            {
                min = nums[mid];
            }

            if(nums[left] > nums[right])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        */
