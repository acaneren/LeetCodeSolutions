class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row_count = len(matrix)
        column_count = len(matrix[0])

        left = 0
        right = (row_count * column_count) - 1
        
        while(left <= right):
            mid = (left + right) // 2

            row = mid // column_count
            column = mid % column_count

            if(matrix[row][column] == target):
                return True
            elif(matrix[row][column] < target):
                left = mid + 1
            else:
                right = mid - 1
        return False