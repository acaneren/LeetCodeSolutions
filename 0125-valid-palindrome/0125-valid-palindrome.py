class Solution:
    def isPalindrome(self, s: str) -> bool:

        my_str = ""

        for i in s:
            if i.isalnum():
                my_str = my_str + i

        my_str = my_str.lower()
        reversed_my_str = my_str[::-1]

        if reversed_my_str == my_str:
            return True
        else:
            return False