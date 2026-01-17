class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            String str = String.valueOf(i);
            boolean check = true;
            for (char c : str.toCharArray()) {
                int digit = c - '0';
                if (digit == 0 || i % digit != 0) {
                    check = false;
                    break;
                }
            }
            if (check) list.add(i);
        }
        return list;
    }
}