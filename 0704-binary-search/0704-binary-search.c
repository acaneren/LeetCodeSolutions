int search(int* nums, int numsSize, int target) {
    
    int left = 0;
    int mid = numsSize / 2;
    int right = numsSize - 1;
    
    while(left <= right){
      
      if(nums[mid] == target){
        return mid;
      }
      
      else if(nums[mid] > target){
        
        right = mid - 1;
        mid = (left + right) / 2;
      }
      else{
        left = mid + 1;
        mid = (left + right) / 2;
      }
    }
    return -1;
}