class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
return false;
                }
                    Character c = stack.pop();
                if(c == '{' && ch != '}'){
                    return false;

                }else if (c == '(' && ch != ')'){
                    return false;

                }else if(c == '[' && ch != ']'){
                    return false;

                }

                }
                
            
            

        }
        
        if(stack.isEmpty()){
            return true;

        }else{
            return false;
        }
        
    }
}
