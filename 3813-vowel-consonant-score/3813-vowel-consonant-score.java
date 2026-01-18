class Solution {
    public int vowelConsonantScore(String s) {
        String vowels = "aeiou";
        int v = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if('a' <= ch && ch <= 'z'){
                if (vowels.indexOf(s.charAt(i)) != -1) {
                    v++;
                }
                else {
                    c++;
                }
            }
        }
        return c == 0 ? 0 : v / c;
    }
}