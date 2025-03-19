import java.util.Stack;

class MinStack {
	
	private Stack<Integer> stack;
	private Stack<Integer> min_stack;
	
    public MinStack() {
        stack = new Stack<>();
        min_stack = new Stack<>(); 
    }
    
    public void push(int val) {
        stack.add(val);
        
        if(min_stack.size() == 0 || val <= min_stack.peek()){
        	min_stack.add(val);
        }
    }
    
    public void pop() {
        int popped_element = stack.pop();
        
        if(popped_element == min_stack.peek()) {
        	min_stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */