class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);
            if (diff == min_diff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                list.add(pair);
            } 
            else if (diff < min_diff) {
                min_diff = diff;
                list.clear();
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                list.add(pair);
            }
        }
        return list;
    }
}