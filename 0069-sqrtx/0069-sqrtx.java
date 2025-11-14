class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;

            if (sq < x) {
                left = mid + 1;

            } else if (sq > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}