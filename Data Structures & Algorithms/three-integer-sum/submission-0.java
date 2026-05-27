class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            right = nums.length - 1;
            left = i + 1;
            while(left < right)
            {
                sum = nums[i] + nums[left] + nums[right];

                    if( sum < 0)
                    {
                        left++;
                    }
                    else if(sum > 0)
                    {
                        right--;
                    } else {

                        List<Integer> nested = new ArrayList<>();
                        nested.add(nums[i]);
                        nested.add(nums[left]);
                        nested.add(nums[right]);
                        if(!finalList.contains(nested))
                        {
                            finalList.add(nested);
                        }
                        left++;
                        right--;
                    }
            }
        }

        return finalList;
    }
}
