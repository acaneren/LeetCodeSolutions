class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        left_pointer = 0
        max_len = 0
        my_dict = {}

        for right_pointer in range(len(s)):

            current_char = s[right_pointer]
            
            if current_char in my_dict and my_dict.get(current_char) >= left_pointer:
                left_pointer = my_dict.get(current_char) + 1
            
            my_dict[current_char] = right_pointer

            max_len = max(max_len, right_pointer - left_pointer + 1)
            
        return max_len