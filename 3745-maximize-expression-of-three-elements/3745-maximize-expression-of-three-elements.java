class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;

        for(Integer num : nums){
            if(num > b){
                if(num > a){
                    b = a;
                    a = num;
                }
                else{
                    b = num;
                }
            }
            if(num < c){
                c = num;
            }
        }
        return a + b - c;
    }
}