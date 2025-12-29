class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));
        int counter = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                counter++;
                if (counter > 2) {
                    continue;
                }
                else {
                    result.append(s.charAt(i));
                }
            }
            else {
                counter = 1;
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}