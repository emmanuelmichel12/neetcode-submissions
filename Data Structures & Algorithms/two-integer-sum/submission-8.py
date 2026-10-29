class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        finallist = []
        mymap = {}
        x = 0
        diff = 0
        for i in nums:
            mymap[i] = x
            x += 1

        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in mymap:
                if i != mymap.get(diff):
                    finallist.append(i)
                    finallist.append(mymap.get(diff))
                    return finallist


        return finallist