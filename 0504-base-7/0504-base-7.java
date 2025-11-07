class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        int n = Math.abs(num);
        while (n > 0) {
            int remainder = n % 7;
            sb.append(remainder);
            n = n / 7;
        }
        if (num < 0) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}