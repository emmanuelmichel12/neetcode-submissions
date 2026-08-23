class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] newArr = new int[nums.length];
        int left = 0;
        int right = newArr.length - 1;
        int index = right;

        while(left <= right)
        {
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];
            if(leftVal > rightVal)
            {
                newArr[index] = leftVal;
                left++;
            }
            else
            {
                newArr[index] = rightVal;
                right--;
            }
            index--;
        }

        return newArr;
        
    }
}