class Solution {
    public int countNegatives(int[][] grid) {
        int i = 0;
        int j = grid[0].length - 1;
        int negative_count = 0;

        while (i < grid.length && j >= 0) {
            if (grid[i][j] < 0) {
                negative_count += grid.length - i;
                j--;
            } 
            else {
                i++;
            }
        }
        return negative_count;
    }
}