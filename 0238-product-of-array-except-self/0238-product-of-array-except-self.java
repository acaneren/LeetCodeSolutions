class Solution {
    public int[] productExceptSelf(int[] nums) {
        
    	int[] answer_array = new int[nums.length];
    	
    	for(int i=0; i < answer_array.length; i++) {
    		answer_array[i] = 1;
    	}
    	
    	for (int i=1; i < nums.length; i++) {
    		
    		answer_array[i] = answer_array[i-1] * nums[i-1];
    		
    	}
    	
    	int right_product = 1;
    	
    	for (int i = (nums.length)-1; i >= 0 ; i--) {
    		
    		answer_array[i] = answer_array[i] * right_product;
    		
    		right_product = right_product * nums[i];
    	}
    	
    	return answer_array;	
    }
}