class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = s.length();
        int b = t.length();
        if(a==0){
            return true ;
        }
        int x = 0;
        for (int i = 0; i < b; i++) {
            
            if (t.charAt(i) == s.charAt(x)) {
                x++;
                if (x == a) {
                    return true;
            }
        }
        }
        return false ;
        }
    }
