class Solution {
    public int strStr(String haystack, String needle) {
        boolean check = true;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && haystack.length() - i >= needle.length()) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    return i;
                } else {
                    check = true;
                }
            }
        }
        return -1;
    }
}