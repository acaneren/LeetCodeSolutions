class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	
    	int pointer_left = 0;
    	int pointer_right = numbers.length-1;
        int[] answer_array = new int[2];
        
        while(pointer_left < pointer_right) {
            	
	    	if(numbers[pointer_left] + numbers[pointer_right] == target) {
	    		answer_array[0] = pointer_left+1;
	    		answer_array[1] = pointer_right+1;
                return answer_array;
	    	}
	    	else if(numbers[pointer_left] + numbers[pointer_right] > target) {
	    		pointer_right--;
	    	}
	    	else {
	    		pointer_left++;
	    	}
        }
        return null;
    }
}