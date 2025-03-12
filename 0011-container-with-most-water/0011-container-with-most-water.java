class Solution {
    public int maxArea(int[] height) {
    	int left_pointer = 0;
    	int right_pointer = height.length-1;
    	int max_size = 0;
		int test_size = 0;
		
    	while(left_pointer < right_pointer) {
    				
    		if(height[left_pointer] == height[right_pointer]) {
    	
    			test_size = Math.min(height[left_pointer], height[right_pointer]) * (right_pointer - left_pointer);
    			if(test_size > max_size) {
    				max_size = test_size; 
    			}
    			left_pointer++;
    		}
    		else if(height[left_pointer] > height[right_pointer]) {
    			test_size = height[right_pointer] * (right_pointer - left_pointer);
    			if(test_size > max_size) {
    				max_size = test_size; 
    			}
    			right_pointer--;
    		}
    		else {
    			test_size = height[left_pointer] * (right_pointer - left_pointer);
    			if(test_size > max_size) {
    				max_size = test_size; 
    			}
    			left_pointer++;
    		}
    	}
    	
    	return max_size;
    }
}