import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i=0; i < nums.length; i++) {
    		
    		if(map.containsKey(nums[i])) {
    			map.put(nums[i], map.get(nums[i]) + 1);
    			if(map.get(nums[i]) == 2) {
    				return true;
    			}
    		}
    		else {
    			map.put(nums[i], 1);
    		}
    	}
    	return false;   	   	
    }
}