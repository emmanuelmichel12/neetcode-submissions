class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < nums.length; right++)
        {
            if(!map.containsKey(nums[right]))
            {
                map.put(nums[right], right);
            }
            else
            {
                int check = map.get(nums[right]);
                if(right - check <= k)
                {
                    return true;
                }
                map.put(nums[right], right);
            }
        }

        return false;
    }
}