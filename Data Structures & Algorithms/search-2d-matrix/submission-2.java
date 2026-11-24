class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cl = matrix.length;
        int rl = matrix[0].length;
        int r = 0, c = rl - 1;
        while (r < cl && c >= 0) {
            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
