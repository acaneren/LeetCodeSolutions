class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb =  new StringBuilder();

        for(int i=0; i < s.length(); i++){
            int idx = (i + k) % s.length();
            sb.append(s.charAt(idx));
        }
        return sb.toString();
    }
}