class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Arrays.sort(numbers);
        int[] sum = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        int currentSum = 0;

        while(left < right)
        {
            currentSum = numbers[left] + numbers[right];
            if(currentSum < target)
            {
                left++;
            }
            else if(currentSum > target)
            {
                right--;
            }
            else
            {
                sum[0] = left + 1;
                sum[1] = right + 1;
                return sum;
            }
        }
        return new int[0];
    }
}
