import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> my_stack = new Stack<>();

        for(int i=0; i < operations.length; i++){

            if(operations[i].equals("D")){

                int doubled_num = my_stack.peek() * 2;
                my_stack.add(doubled_num);
            }
            else if(operations[i].equals("C")){

                my_stack.pop();
            }
            else if (operations[i].equals("+")){

                int num1 = my_stack.pop();
                int num2 = my_stack.peek();
                int result = num1 + num2;

                my_stack.add(num1);
                my_stack.add(result);
            }
            else{
                my_stack.add(Integer.valueOf(operations[i]));
            }

        }
        int sum = 0;
        while(!my_stack.isEmpty()){
            sum += my_stack.pop();
        }
        return sum;
    }
}