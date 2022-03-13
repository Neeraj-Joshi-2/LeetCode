class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();  
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                 stk.push(s.charAt(i));
            }
            
            else if (!stk.empty() && stk.peek()=='(' && s.charAt(i)== ')'){
                stk.pop();
            }
            else if (!stk.empty() && stk.peek()=='[' && s.charAt(i)== ']'){
                stk.pop();
            }
            else if (!stk.empty() && stk.peek()=='{'  &&  s.charAt(i)== '}'){
                stk.pop();
            }
            else return false;
            
        }
        
        if(stk.empty()) return true;
        return false;
       
    }
}
