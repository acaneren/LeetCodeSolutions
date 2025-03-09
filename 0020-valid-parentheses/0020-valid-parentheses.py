class Solution:
    def isValid(self, s: str) -> bool:
        
        stack = []
        
        for i in s:
            if i == '(' or i == '[' or i == '{':
                stack.append(i)
            else:
                
                if(len(stack) == 0):
                    return False

                popped = stack.pop()

                if(popped == '(' and i != ')' or 
                   popped == '[' and i != ']' or 
                   popped == '{' and i != '}'):
                    
                    return False
        
        if len(stack) == 0:
            return True
        else:
            return False