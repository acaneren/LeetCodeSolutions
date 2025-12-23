class Solution {
    public int smallestNumber(int n, int t) {
        int i = 0;
        while (i < 10) {
            int num = n;
            int product = 1;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }
            if (product % t == 0){
                return n;
            }
            else {
                n++;
                i++;
            }
        }
        return -1;
    }
}