class Stack_ValidateArray {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>() ;
        int itr=0 ;
        for(int i = 0 ; i < pushed.length ; i++){
            stack.push(pushed[i]) ;
            
            while(!stack.empty() && stack.peek()==popped[itr]){
                stack.pop() ;
                itr+=1 ;
            }           
        } 
        return stack.empty() ;
        
    }
}



