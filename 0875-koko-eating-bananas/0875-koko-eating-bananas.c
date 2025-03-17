int minEatingSpeed(int* piles, int pilesSize, int h) {
    
    int left = 1;
    
    int max = piles[0];
    
    for(int i=1; i < pilesSize; i++){
      if(piles[i] > max){
        max = piles[i];
      }
    }
    
    int right = max;
    
    while(left <= right){
      
      int mid = left + (right - left) / 2;
      
      long long needed_hours = 0;
      
      for(int i=0; i < pilesSize; i++){
        needed_hours = needed_hours + ((piles[i] + mid - 1) / mid);
      }
      
      if(needed_hours <= h){
        right = mid - 1;
      }
      else{
        left = mid + 1;
      }
    }
    return left;
}