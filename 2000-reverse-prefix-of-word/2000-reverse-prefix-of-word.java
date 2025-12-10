class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        int idx;
        boolean ch_found = false;
        
        for (idx = 0; idx < word.length(); idx++) {
            if (word.charAt(idx) != ch) {
                stack.add(word.charAt(idx));
            } 
            else {
                stack.add(word.charAt(idx));
                ch_found = true;
                idx++;
                break;
            }
        }
        
        if (!ch_found) {
            return word;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        while (idx < word.length()) {
            sb.append(word.charAt(idx));
            idx++;
        }
        return sb.toString();
    }
}