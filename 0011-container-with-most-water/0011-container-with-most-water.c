int maxArea(int* height, int heightSize) {
    int left_pointer = 0;
    int right_pointer = heightSize-1;
    int max_size = 0;
    int test_size = 0;

    #define MIN(a, b) ((a) < (b) ? (a) : (b))

    while(left_pointer < right_pointer){
      
      test_size = MIN(height[left_pointer], height[right_pointer]) * (right_pointer - left_pointer);
      
      if(test_size > max_size){
        max_size = test_size;
      }
      if(height[left_pointer] < height[right_pointer]){ 
        left_pointer++;
      }
      else{
        right_pointer--;
      }
    }
    return max_size;
}