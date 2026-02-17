class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        boolean[] arr = new boolean[101];
        for (int i : bulbs) {
            if (arr[i]) {
                arr[i] = false;
            }
            else {
                arr[i] = true;
            }
        }

        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                results.add(i);
            }
        }
        return results;
    }
}