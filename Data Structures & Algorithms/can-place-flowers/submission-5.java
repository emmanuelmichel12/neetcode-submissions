class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        boolean[] planted = new boolean[flowerbed.length];

        if(flowerbed.length == 1)
        {
            if(flowerbed[0] == 0)
            {
                count++;
            }

            return count >=n;
        }

        if(flowerbed[0] == 0 && flowerbed[1] == 0)
        {
            count++;
            planted[0] = true;
        }

        for(int i = 1; i < flowerbed.length - 1; i++)
        {
            if(planted[i - 1] == false && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i + 1] == 0)
            {
                count++;
                planted[i] = true;
            }
        }

        if(flowerbed[flowerbed.length - 1 ] == 0 && planted[flowerbed.length - 2] == false && flowerbed[flowerbed.length - 2] == 0)
        {
            count++;
        }

        if(count >= n)
        {
            return true;
        }

        return false;
    }
}