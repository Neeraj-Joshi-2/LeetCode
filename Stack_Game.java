class Stack_Game {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String i : ops){
            System.out.print(stack) ;
            if(i.equals("C")){
                stack.pop() ;
            }
            else if(i.equals("D")){
                stack.push(2*stack.peek()) ;
            }
            else if(i.equals("+")){
                int a = stack.peek() ;
                stack.pop() ;
                int b = stack.peek() ;
                stack.push(a) ;
                stack.push(a+b) ;
            }
            else{
                int e = Integer.parseInt(i);
                stack.push(e) ;
            }
        }
        int ans=0;
        for(Integer t : stack){
            ans+=t ;
        }
        return ans ;
    }
}

