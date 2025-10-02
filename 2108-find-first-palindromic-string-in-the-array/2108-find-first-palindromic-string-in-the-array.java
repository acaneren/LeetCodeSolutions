class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i < words.length; i++) {
            int left_pointer = 0;
            int right_pointer = words[i].length() - 1;
            boolean isPalindrome = true;

            while (left_pointer <= right_pointer) {
                if (words[i].charAt(left_pointer) != words[i].charAt(right_pointer)) {
                    isPalindrome = false;
                    break;
                }
                left_pointer++;
                right_pointer--;
            }

            if (isPalindrome) {
                return words[i];
            }
        }
        return "";
    }
}