class Solution {
    public int[] replaceElements(int[] arr) {

        int largest = -999;

        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] > largest)
                {
                    arr[i] = arr[j];
                    largest = arr[j];
                }
            }

            largest = -999;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}