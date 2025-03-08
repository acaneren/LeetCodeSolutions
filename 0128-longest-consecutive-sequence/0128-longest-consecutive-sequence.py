class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        if len(nums) == 0:
            return 0

        sorted_list = (sorted(nums))
        counter_list = []
        count = 1

        for i in range(1,len(sorted_list)):
            if sorted_list[i] - sorted_list[i-1] == 1:
                count = count + 1
            elif (sorted_list[i] - sorted_list[i-1] == 0):
                continue
            else:
                counter_list.append(count)
                count = 1
        
        counter_list.append(count)

        return max(counter_list)