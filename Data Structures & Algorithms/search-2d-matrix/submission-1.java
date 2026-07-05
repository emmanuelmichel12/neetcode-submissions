class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int row = matrix.length;
        int column = matrix[0].length;
        int right = (row * column) - 1;

        while(left <= right)
        {
            int mid = (left + right) / 2;
            int rows = mid / column;
            int cols = mid % column;

            if(matrix[rows][cols] == target)
            {
                return true;
            }

            if(matrix[rows][cols] < target)
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
