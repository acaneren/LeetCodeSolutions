class Solution {
    public int[] evenOddBit(int n) {
        String binaryString = Integer.toBinaryString(n);
        int even = 0, odd = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(binaryString.length() - 1 - i) == '1') {
                if (i % 2 == 0) even++;
                else odd++;
            }
        }
        return new int[]{even, odd};
    }
}