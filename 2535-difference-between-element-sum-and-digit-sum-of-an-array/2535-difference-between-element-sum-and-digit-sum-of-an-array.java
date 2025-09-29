class Solution {
    public int differenceOfSum(int[] nums) {
        int digit_sum = 0;
        int sum = 0;
        for(int num : nums){
            sum += num;
            while(num >= 10){
                digit_sum += num % 10;
                num /= 10;
            }
            digit_sum += num;
        }
        
        if (digit_sum >= sum){
            return digit_sum - sum;
        }
        return sum - digit_sum;
    }
}