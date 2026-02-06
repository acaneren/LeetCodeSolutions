class Solution {
    public String reverseByType(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } 
            else if (!Character.isLetter(arr[right])) {
                right--;
            } 
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        left = 0;
        right = s.length() - 1;
        while (left < right) {
            if (Character.isLetterOrDigit(arr[left])) {
                left++;
            } 
            else if (Character.isLetterOrDigit(arr[right])) {
                right--;
            } 
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }
}