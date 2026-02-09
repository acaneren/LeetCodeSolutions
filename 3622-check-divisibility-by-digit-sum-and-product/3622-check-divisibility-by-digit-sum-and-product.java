class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int original_n = n;

        while(n > 0){
            sum += (n % 10);
            product *= (n % 10);
            n /= 10;
        }
        return original_n % (sum + product) == 0;
    }
}