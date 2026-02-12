class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        int min_count = Integer.MAX_VALUE;
        int min_digit = 10;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() < min_count){
                min_count = e.getValue();
                min_digit = e.getKey();
            }
            else if (e.getValue() == min_count) {
                if(e.getKey() < min_digit){
                    min_digit = e.getKey();
                }
            }
        }
        return min_digit;
    }
}