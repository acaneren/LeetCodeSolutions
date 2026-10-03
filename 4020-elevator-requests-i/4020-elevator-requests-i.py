class Solution:
    def elevatorRequests(self, n: int, requests: list[int]) -> int:
        total_time = requests[0]

        if(len(requests) == 1):
            return total_time

        for i in range(1, len(requests)):
            total_time += abs(requests[i] - requests[i-1])
        return total_time