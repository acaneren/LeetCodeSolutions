class Solution {
    public boolean isPalindrome(String s) {
        
    	int pointer_left = 0;
    	int pointer_right = s.length()-1;
    	s = s.toLowerCase();
    	
    	while(pointer_left < pointer_right) {
    	
	    	while( (pointer_left < pointer_right) && (!Character.isLetterOrDigit(s.charAt(pointer_left))) ) {
	    		pointer_left++;
	    	}
	    	while( (pointer_right > pointer_left) && (!Character.isLetterOrDigit(s.charAt(pointer_right))) ) {
	    		pointer_right--;
	    	}
	    	if(s.charAt(pointer_left) != s.charAt(pointer_right)) {
	    		return false;
	    	}
	    	pointer_left++;
	    	pointer_right--;
    	}
    	return true;
    }
}