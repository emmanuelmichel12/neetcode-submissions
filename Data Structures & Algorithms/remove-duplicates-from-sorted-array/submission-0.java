class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int left = 0;

        for(int right = 1; right < nums.length; right++)
        {
            if(nums[right] != nums[left])
            {
                k++;
                left++;
                nums[left] = nums[right];
            }
        }
     return k;   
    }
}