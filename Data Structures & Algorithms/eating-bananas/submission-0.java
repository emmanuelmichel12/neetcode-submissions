class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Arrays.sort(piles);

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int val = right;

        while(left <= right)
        {
            int mid = (left + right) / 2;
            int hours = 0;

            for(int i = 0; i < piles.length; i++)
            {
                hours += Math.ceil((double)piles[i] / mid);
            }

            if(hours <= h)
            {
                val = mid;
                right = mid - 1;

            }
            else
            {
                left = mid + 1;
            }
        }

        return val;
    }
}
