class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Arrays.sort(nums);
        int [] solution = new int[2];
        int check = 0;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                check = nums[i] + nums[j];
                if(check == target)
                {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
       return solution; 
    }
}
