bool isPalindrome(char* s) {
    
    int i = 0;
    int len = strlen(s);
    for (i; i < len; i++){
      s[i] = tolower(s[i]);
    }
    
    int left_pointer = 0;
    int right_pointer = len-1;
    
    while(left_pointer < right_pointer){
      
      while(!isalnum(s[left_pointer]) && (left_pointer < right_pointer) ){
        left_pointer++;
      }
      while( !isalnum(s[right_pointer]) && right_pointer > left_pointer){
        right_pointer--;
      }
      
      if(s[left_pointer] != s[right_pointer]){
        return false;
      }
      
      left_pointer++;
      right_pointer--;
      
    }
    return true;
}