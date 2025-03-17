class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left = 1
        right = max(piles)

        while(left <= right):

            mid = (left + right) // 2

            hourse_needed = 0

            for i in piles:
                hourse_needed = hourse_needed + ( (i + (mid - 1)) // mid) 
            
            if(hourse_needed <= h):
                right = mid - 1
            else:
                left = mid + 1

        return left

