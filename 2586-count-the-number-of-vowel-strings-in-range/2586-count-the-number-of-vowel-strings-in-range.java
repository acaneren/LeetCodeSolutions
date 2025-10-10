class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String vowels =  "aeiou";
        int counter = 0;

        while(left <= right){
            if(vowels.indexOf(words[left].charAt(0)) != -1){
                if(vowels.indexOf((words[left].charAt(words[left].length() - 1))) != -1){
                    counter++;
                }
            }
            left++;
        }
        return counter;
    }
}