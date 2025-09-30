class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_words = 0;
        int wordCount = 0;
        for(String s: sentences){
            wordCount = 0;
            for(int i=0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    wordCount++;
                }
            }
            wordCount++;
            if(wordCount > max_words){
                max_words = wordCount;
            }
        }
        return max_words;
    }
}