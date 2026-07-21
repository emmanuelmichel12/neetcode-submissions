class Solution {
    public boolean isPerfectSquare(int num) {

        int left = 0;
        int right = num;
        int mid;
        double check = Math.sqrt(num);

        while(left <= right)
        {
            mid = (left + right) / 2;

            if(mid == check)
            {
                return true;
            }
            else if(mid < check)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }

        }

        return false;
    }
}