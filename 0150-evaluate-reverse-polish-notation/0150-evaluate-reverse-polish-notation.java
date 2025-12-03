class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack1 = new Stack<>();

        for(String s: tokens){
            if(s.equals("+")){
                stack1.add(stack1.pop() + stack1.pop());
            }
            else if(s.equals("-")){
                int x = stack1.pop();
                stack1.add(stack1.pop() - x);
            }
            else if(s.equals("*")){
                stack1.add(stack1.pop() * stack1.pop());
            }
            else if(s.equals("/")){
                int x = stack1.pop();
                stack1.add(stack1.pop() / x);
            }
            else{
                stack1.add(Integer.valueOf(s));
            }
        }
        return stack1.pop();
    }
}