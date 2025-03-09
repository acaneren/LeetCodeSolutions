import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        
        for (char c : s.toCharArray()) {
        	
        	if (c == '(' || c == '{' || c == '[') {
        		stack1.add(c);
        	}
        	else {
        		if(stack1.isEmpty()) {
        			return false;
        		}
        		
                char popped_element = stack1.pop();
        		if(popped_element == '{' && c != '}' ||
        				popped_element == '[' && c != ']'||
        					popped_element == '(' && c != ')') {
        			
        			return false;
        		}
        	}
        }
        return stack1.isEmpty();
    }
}