package BinarySearch;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = (row * col) - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int midX = mid / col;
            int midY = mid % col;
            if (matrix[midX][midY] == target) {
                return true;
            } else if (matrix[midX][midY] > target) {
                end = mid - 1; // search the right side
            } else {
                start = mid + 1; // search the left side
            }

        }
        return false;
    }
}
