import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        
    	Stack<Integer> stack1 = new Stack<>();
    	
    	for (String c : tokens) {
    		
    		if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")) {
    			stack1.add(Integer.valueOf(c));
    		}
    		else {
    			int num2 = stack1.pop();
    			int num1 = stack1.pop();
    			int product;
    			
    			switch(c) {
    			
    			case "+":
    				product = num1 + num2;
    				stack1.add(product);
    				break;
    			case "-":
    				product = num1 - num2;
    				stack1.add(product);
    				break;
    			case "*":
    				product = num1 * num2;
    				stack1.add(product);
    				break;
    			case "/":
    				product = num1 / num2;
    				stack1.add(product);
    				break;
    			}
    		}
    	}
    	return stack1.pop();
    }
}