class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int num = n;
        while (true) {
            if (num == 1) return true;

            int new_num = 0;
            while (num > 0) {
                new_num += (num % 10) * (num % 10);
                num /= 10;
            }
            num = new_num;
            if (set.contains(num)) return false;
            set.add(num);
        }
    }
}