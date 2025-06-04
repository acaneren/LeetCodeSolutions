class Solution:
    def isPalindrome(self, x: int) -> bool:

        if x < 0 :
            return False
        
        original_x = x
        reverse_num = 0
        
        while x > 0:

            reverse_num = reverse_num * 10 + (x % 10)
            x = x // 10
            
        return reverse_num == original_x