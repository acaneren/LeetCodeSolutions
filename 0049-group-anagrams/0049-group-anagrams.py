class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        my_dict = dict()

        for word in strs:
            key = ''.join(sorted(word))
            
            if key in my_dict:
                my_dict[key].append(word)
            else:
                my_dict[key] = [word]
        return list(my_dict.values())