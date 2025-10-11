class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();

        while(left <= right){
            if(vowels.indexOf(arr[left]) != -1 && vowels.indexOf(arr[right]) != -1){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(vowels.indexOf(arr[left]) == -1){
                left++;
            }
            else if(vowels.indexOf(arr[right]) == -1){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }
}