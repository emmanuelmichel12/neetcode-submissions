class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newArr = new int[nums.length];
        int val = 1;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if( i != j)
                {
                    val *= nums[j];
                }
            }
            newArr[i] = val;
            val = 1;
        }

        return newArr;
    }
}  
