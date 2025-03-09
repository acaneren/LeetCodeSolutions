class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for i in tokens:
            if i != "+" and i != "-" and i != "*" and i != "/":
                stack.append(int(i))
            
            else:

                num2 = stack.pop()
                num1 = stack.pop()
                result = 0

                if i == "+":
                    result = num1 + num2
                    stack.append(result)
                elif i == "-":
                    result = num1 - num2
                    stack.append(result)
                elif i == "*":
                    result = num1 * num2
                    stack.append(result)
                elif i == "/":
                    result = int(num1 / num2)
                    stack.append(result)

        return stack.pop()