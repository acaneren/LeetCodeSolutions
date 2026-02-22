class Solution {
    public int binaryGap(int n) {
        String str_bin = Integer.toBinaryString(n);
        int last_seen_idx = -1;
        int max_len = 0;
        for (int i = 0; i < str_bin.length(); i++) {
            if (last_seen_idx == -1 && str_bin.charAt(i) == '1') {
                last_seen_idx = i;
            } 
            else if (str_bin.charAt(i) == '1') {
                if (i - last_seen_idx > max_len) {
                    max_len = i - last_seen_idx;
                }
                last_seen_idx = i;
            }
        }
        return max_len;
    }
}