class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            int total = 0;
            int counter = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    if (i * i == num) {
                        total += i;
                        counter++;
                    }
                    else {
                        total += i;
                        total += num / i;
                        counter += 2;
                    }
                }
                if (counter > 4) {
                    break;
                }
            }
            if (counter == 4) {
                sum += total;
            }
        }
        return sum;
    }
}