class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        my_dict = {}
        answer_list = []

        for num in nums:
            if num in my_dict:
                my_dict[num] = my_dict[num] + 1
            else:
                my_dict[num] = 1
        
        sorted_items = dict(sorted(my_dict.items(), key=lambda x: x[1], reverse=True))
        
        for i in range(k):
            answer_list.append(sorted_items[i][1])
        return answer_list