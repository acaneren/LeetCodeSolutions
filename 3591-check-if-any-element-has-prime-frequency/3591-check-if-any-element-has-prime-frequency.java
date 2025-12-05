class Solution {
    boolean isPrime(int num) {
        if (num == 1 || num == 0) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } 
            else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (isPrime(e.getValue())) {
                return true;
            }
        }
        return false;
    }
}