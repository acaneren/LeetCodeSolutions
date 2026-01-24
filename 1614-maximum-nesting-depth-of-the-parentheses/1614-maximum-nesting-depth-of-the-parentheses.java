class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int max_depth = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                depth++;
                max_depth = Math.max(depth,max_depth);
            }
            else if(c == ')'){
                depth--;
            }
        }
        return max_depth;
    }
}