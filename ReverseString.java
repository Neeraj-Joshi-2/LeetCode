class ReverseString {
    public void reverseString(char[] s) {
        char temp ;
        int start = 0 , end = s.length-1 ;
        while(start<end){
            temp = s[start] ;
            s[start] = s[end] ;
            s[end] = temp ;
            start++ ;
            end-- ;
        }
    }
}
