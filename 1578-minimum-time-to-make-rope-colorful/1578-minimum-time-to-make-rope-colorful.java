class Solution {
    public int minCost(String colors, int[] neededTime) {
        int total_time = 0;
        int segment_sum = neededTime[0];
        int max = neededTime[0];

        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) != colors.charAt(i - 1)) {
                total_time += segment_sum - max;
                segment_sum = neededTime[i];
                max = neededTime[i];
            } 
            else {
                segment_sum += neededTime[i];
                if (neededTime[i] > max) {
                    max = neededTime[i];
                }
            }
        }
        total_time += segment_sum - max;
        return total_time;
    }
}