class Solution {
    public static int fib(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }

        int sum = 0;
        if (n > 0){

            sum = fib(n-1) + fib(n-2);
        }
        return sum;
    }
}

