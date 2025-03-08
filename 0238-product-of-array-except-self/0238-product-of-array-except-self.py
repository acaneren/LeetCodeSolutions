class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        answer_list = [1] * len(nums)

        for i in range(1, len(nums)):
            answer_list[i] = answer_list[i-1]  * nums[i-1]

        right_product = 1
        for i in range(len(nums)-1, -1, -1):
            answer_list[i] = answer_list[i] * right_product
            right_product = right_product * nums[i]

        return answer_list