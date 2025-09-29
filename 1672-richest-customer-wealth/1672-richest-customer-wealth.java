class Solution {
    public int maximumWealth(int[][] accounts) {

        int max_sum = 0;

        for(int[] acc : accounts){
            int sum = 0;

            for (int j = 0; j < acc.length; j++) {
                sum += acc[j];
            }
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}