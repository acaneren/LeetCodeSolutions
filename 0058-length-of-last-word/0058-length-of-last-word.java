class Solution {
    public int lengthOfLastWord(String s) {
        
    	int count=0;
    	int wordlength=0;
    	String[] newstr = s.split(" ");
    	
    	for(int i=0; i < newstr.length; i++) {
    		count++;
    	}
    	
    	for(int i=0; i < newstr[count-1].length(); i++) {
    		wordlength++;
    	}
    	return wordlength;
    }
}