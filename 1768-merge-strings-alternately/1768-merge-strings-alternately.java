class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1=0;
        int p2=0;
        String str = "";

        while(p1 < word1.length() && p2 < word2.length()) {
            str += word1.charAt(p1);
            p1++;
            
            str += word2.charAt(p2);
            p2++;
        }
        while(p1 < word1.length()){
            str += word1.charAt(p1);
            p1++;
        }
        while(p2 < word2.length()){
            str += word2.charAt(p2);
            p2++;
        }
        return str;
    }
}