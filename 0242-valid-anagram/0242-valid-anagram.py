class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        my_dict1 = dict()
        my_dict2 = dict()

        for i in s:
            if i in my_dict1:
                my_dict1[i] = my_dict1.get(i) + 1
            else:
                my_dict1.update({i:1})
        for i in t:
            if i in my_dict2:
                my_dict2[i] = my_dict2.get(i) + 1
            else:
                my_dict2.update({i:1})

        if my_dict1 == my_dict2:
            return True
        else:
            return False