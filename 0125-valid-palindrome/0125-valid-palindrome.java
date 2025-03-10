class Solution {
    public boolean isPalindrome(String s) {
        
    	String my_str = "";
    	
    	for(int i=0; i < s.length(); i++) {
    		
    		if( (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
    			my_str = my_str + s.charAt(i);
    		}
    	}
    	
    	my_str = my_str.toLowerCase();
    	
    	String reversed_my_str = "";
    	
    	for (int i = (my_str.length()-1) ; i >= 0 ; i--) {
    		
    		reversed_my_str = reversed_my_str + my_str.charAt(i);
    	}
    	
    	if (my_str.equals(reversed_my_str)) {
    		
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}