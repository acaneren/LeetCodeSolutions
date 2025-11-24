class Solution {
    public int minimumFlips(int n) {
        String num = Integer.toBinaryString(n);
        int left = 0;
        int right = num.length() - 1;
        if (right == 0) return 0;
        
        int counter = 0;
        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                counter++;
            }
            left++;
            right--;
        }
        return counter * 2;
    }
}