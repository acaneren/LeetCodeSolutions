class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min2 = Integer.MAX_VALUE;

        for(char letter : letters){

            if(letter > target && letter < min2){
                min2 = (int) letter;
            }
        }
        if(min2 == Integer.MAX_VALUE){
            return letters[0];
        }
        else{
            return (char) min2;
        }
    }
}