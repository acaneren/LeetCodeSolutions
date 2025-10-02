class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        for(int i = 1; i < s.length(); i++){
            
            int ascii_1 = (int) s.charAt(i-1);
            int ascii_2 = (int) s.charAt(i);
            
            if(ascii_1 != ascii_2 && Math.abs(ascii_1 - ascii_2) != 32){
                count++;
            }
        }
        return count;
    }
}