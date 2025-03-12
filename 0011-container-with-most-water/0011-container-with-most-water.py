class Solution:
    def maxArea(self, height: List[int]) -> int:
        left_pointer = 0
        right_pointer = len(height)-1
        max_size = 0

        while(left_pointer < right_pointer):
            
            test_size = min(height[left_pointer], height[right_pointer]) * (right_pointer - left_pointer)

            if (test_size > max_size):
                max_size = test_size

            if (height[left_pointer] < height[right_pointer]):
                left_pointer = left_pointer + 1
            else:
                right_pointer = right_pointer - 1
        
        return max_size