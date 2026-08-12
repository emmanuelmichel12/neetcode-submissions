class Solution {
    public int findDuplicate(int[] nums) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(table.containsValue(nums[i]))
            {
                return nums[i];
            }
            else
            {
                table.put(i, nums[i]);
            }
        }
       return 0; 
    }
}
