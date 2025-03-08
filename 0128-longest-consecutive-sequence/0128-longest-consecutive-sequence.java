import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        
    	if(nums.length == 0) {
    		return 0;
    	}
    	
    	Arrays.sort(nums);
    	int freq_count = 1;
        ArrayList<Integer> counter_list = new ArrayList<>();
        
        for (int i=1; i < nums.length; i++) {
        	if(nums[i] - nums[i-1] == 1) {
        		freq_count = freq_count + 1;
        	}
        	else if(nums[i] - nums[i-1] == 0) {
        		continue;
        	}
        	else {
        		counter_list.add(freq_count);
        		freq_count = 1;
        	}
        }
        counter_list.add(freq_count);
        
        int max_freq = 0;
        		
        for (int i=0; i < counter_list.size(); i++) {
        	if (counter_list.get(i) > max_freq) {
        		max_freq = counter_list.get(i);
        	}
        }
        return max_freq;    
    }
}