class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String str : tokens){
            if(str.equals("+") || str.equals("-") 
              || str.equals("*") || str.equals("/")){
                
                    Integer number1 = stack.pop();
                    Integer number2 = stack.pop();

                    Integer result = 0;

                    if(str.equals("+")){
                        result = number2 + number1;
                    }else if(str.equals("-")){
                        result = number2 - number1;
                    }else if(str.equals("*")){
                        result = number2 * number1;
                    }else if(str.equals("/")){
                        result = number2/number1;
                    }

                    stack.push(result);

                

            }else{
                stack.push(Integer.parseInt(str));
            }

        }

        return stack.pop();
        
    }
}
