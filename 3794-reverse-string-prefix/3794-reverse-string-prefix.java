class Solution {
    public String reversePrefix(String s, int k) {

        StringBuilder first_part = new StringBuilder(s.substring(0, k));
        first_part.reverse();
        return first_part + s.substring(k);
    }
}