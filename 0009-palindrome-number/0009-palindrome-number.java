class Solution {
    public boolean isPalindrome(int x) {
        int num = 0;
        int originalnum = x;
        if(x < 0) {
        	return false;
        }
        else {
        	while(x >= 10) {
        		num =(num * 10) + (x % 10);
        		x = x / 10;
        	}
        	num = (num * 10) + x;
        	return num == originalnum;
        }
    }
}