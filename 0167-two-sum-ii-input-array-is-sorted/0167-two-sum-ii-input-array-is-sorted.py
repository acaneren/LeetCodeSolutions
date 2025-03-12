class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left_pointer = 0
        right_pointer = len(numbers) - 1
        i = 0
        answer_list = list()


        while(left_pointer < right_pointer):
            if(numbers[left_pointer] + numbers[right_pointer] == target):
                answer_list.append(left_pointer + 1)
                answer_list.append(right_pointer + 1)
                return answer_list
            elif(numbers[left_pointer] + numbers[right_pointer] > target):
                right_pointer = right_pointer - 1

            else:
                left_pointer = left_pointer + 1
        
        return None
            
