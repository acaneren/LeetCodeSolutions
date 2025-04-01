class Solution {
    public int lengthOfLongestSubstring(String s) {
     
    	HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();
    	
    	int left_pointer = 0;
    	int max_len = 0;
    	
    	for(int right_pointer = 0; right_pointer < s.length(); right_pointer++) {
    		
    		char current_char = s.charAt(right_pointer);
    		
    		if(my_map.containsKey(current_char) && my_map.get(current_char) >= left_pointer) {
    			
    			left_pointer = my_map.get(current_char) + 1;
    		}

            my_map.put(current_char, right_pointer);
    		max_len = Math.max(max_len, right_pointer - left_pointer + 1);
    	}
    	return max_len;
    }
}