import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	for(Integer n : nums) {
    		if(set.contains(n)) {
    			return true;
    		}
    		else {
    			set.add(n);
    		}
    	}
    	return false;
    }
}