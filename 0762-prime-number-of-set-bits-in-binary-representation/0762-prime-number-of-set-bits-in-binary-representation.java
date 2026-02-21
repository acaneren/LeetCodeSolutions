class Solution {
    public int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            int bit = n & 1;
            if (bit == 1) count++;
            n = n >> 1;
        }
        return count;
    }
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        int i = 1;
        int sqrt = (int) Math.sqrt(n);
        while (6 * i - 1 <= sqrt) {
            if (n % (6 * i + 1) == 0) return false;
            if (n % (6 * i - 1) == 0) return false;
            i++;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        while (left <= right) {
            if (isPrime(countSetBits(left))) count++;
            left++;
        }
        return count;
    }
}