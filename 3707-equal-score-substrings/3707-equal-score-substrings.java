class Solution {
    public boolean scoreBalance(String s) {
        int[] left = new int[s.length()];
        left[0] = s.charAt(0) - 96;
        int[] right = new int[s.length()];
        right[s.length() - 1] = 0;

        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] + (s.charAt(i) - 'a' + 1);
        }
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] + (s.charAt(i + 1) - 'a' + 1);
        }

        for (int i = 0; i < left.length - 1; i++) {
            if (left[i] == right[i]) return true;
        }
        return false;
    }
}