class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        int[] arr = new int[k];
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i : map.keySet())
        {
            maxHeap.add(i);
        }
        for(int i = 0; i < k; i++)
        {
            arr[i] = maxHeap.poll();
        }

        return arr;
    }
}
