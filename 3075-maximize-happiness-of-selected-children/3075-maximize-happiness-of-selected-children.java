class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int decrease = 0;
        long sum = 0;
        int n = happiness.length;

        for (int i = n - 1; i >= n - k; i--) {
            sum += Math.max(happiness[i] - decrease, 0);
            decrease++;
        }
        return sum;
    }
}