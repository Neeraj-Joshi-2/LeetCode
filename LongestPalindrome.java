class Solution {
    int max_=0,end1=0,end2=0,len=0;
    public String longestPalindrome(String s) {
        int strat=0, end=s.length()-1 ;
        
        for(int i=0; i<s.length(); i++){
            for(int j=s.length()-1; j>=0; j--){
                int temp=end2-end1;
                if(j>=i && i!=j && temp<=j-i){
                    isPalindrome(s,i,j);
                }
            }
        }
        return s.substring(end1, end2+1) ;
    }

        
    public void isPalindrome(String s, int a, int b){
        int start=a,end=b,max=0;
        boolean bool=true;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                max=0;
                bool=false;
                break;
            }
            start++;
            end--;
            max++;
        }
        
        int len_temp = b-a;
        if(bool && len_temp>len && max_<=max){
            max_=max;
            end1=a;
            end2=b;
            len=b-a;
        }
    }
}
