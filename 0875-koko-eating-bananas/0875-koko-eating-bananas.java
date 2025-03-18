class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
    	int left = 1;
    	
    	int max = piles[0];
    	for(int pile : piles) {
    		if(pile > max) {
    			max = pile;
    		}
    	}
    	int right = max;
    	
    	while(left <= right) {
    		int mid = (left + right) / 2;
    		
    		long eating_time = 0;
    		
    		for(int i=0; i < piles.length; i++) {
    			eating_time = eating_time + (piles[i] + mid - 1) / mid;
    		}
    		
    		if(eating_time <= h) {
    			right = mid - 1;
    		}
    		else {
    			left = mid + 1;
    		}
    	}
    	return left;
    }
}