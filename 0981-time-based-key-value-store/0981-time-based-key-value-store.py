class TimeMap:

    def __init__(self):
        self.store = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.store:
            self.store[key] = []
        self.store[key].append((timestamp, value))

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.store:
            return ""
        
        timestamp_values = self.store[key]
        
        left = 0
        right = len(timestamp_values) - 1

        while left <= right:
            mid = (left + right) // 2

            mid_timestamp, mid_value = timestamp_values[mid]

            if(mid_timestamp == timestamp):
                return mid_value
            
            elif(mid_timestamp < timestamp):
                left = mid + 1
            else:
                right = mid - 1
        
        if right >= 0:
            return timestamp_values[right][1]
        
        return ""

# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)