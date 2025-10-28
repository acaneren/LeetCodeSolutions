class Solution {
    public long removeZeros(long n) {
        String num  = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < num.length(); i++){
            Character c = num.charAt(i);
            if(c != '0'){
                sb.append(c);
            }
        }

        if(sb.length() == 0){
            return 0;
        }
        return Long.parseLong(sb.toString());
    }
}