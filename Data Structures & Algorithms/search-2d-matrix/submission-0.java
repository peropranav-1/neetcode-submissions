class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int m = matrix.length; // row
        int n = matrix[0].length; // columns
        int right = (m * n) - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int getNum = getCellFromNum(mid, n, matrix);
            if (getNum == target)
                return true;
            else if (getNum < target) {
                left = mid + 1;
            } else if (getNum > target) {
                right = mid - 1;
            }
        }
        return false;
    }

    private int getCellFromNum(int num, int n, int[][] matrix) {
        int row = num / n;
        int col = num % n;
        return matrix[row][col];
    }
}
