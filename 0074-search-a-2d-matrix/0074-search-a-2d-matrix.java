class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_count = matrix.length;
        int column_count = matrix[0].length;
        
        int left = 0;
        int right = (row_count * column_count) - 1;
        
        while(left <= right) {
        	
        	int mid = (left + right) / 2;
        	
        	int row = mid / column_count;
        	int column = mid % column_count;
        	
        	if(matrix[row][column] == target) {
        		return true;
        	}
        	else if(matrix[row][column] < target) {
        		left = mid + 1;
        	}
        	else {
        		right = mid - 1;
        	}
        }
        return false;
    }
}