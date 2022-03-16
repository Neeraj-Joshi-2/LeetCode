class Stack_ValidPath {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");            
        Stack<String> st = new Stack<>();
        for(String s: paths) {                             
            if(s.equals("")) continue;
            if(s.equals(".")) continue;
            if(s.equals("..")) 
                if(!st.isEmpty()) st.pop();  
                else continue;
            else st.add(s);
        }
        System.out.println(st) ;
        return "/" + String.join("/", st);        
    }
}
