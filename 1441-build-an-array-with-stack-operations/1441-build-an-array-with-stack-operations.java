class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int p = 0;

        for (int i = 1; i <= n; i++) {
            if (target[p] == i) {
                operations.add("Push");
                p++;
                if (p == target.length) {
                    return operations;
                }
            } else {
                operations.add("Push");
                operations.add("Pop");
            }
        }
        return operations;
    }
}