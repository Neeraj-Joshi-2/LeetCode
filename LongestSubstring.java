class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        int maxLength=0,i=0,j=0 ;
        while(j<s.length()){
            if(!list.contains(s.charAt(j))){
                list.add(s.charAt(j));
                j++;
                maxLength=Math.max(maxLength,j-i);
            }
            else{
                list.remove(Character.valueOf(s.charAt(i)));
                    i++;
                }
            }
        return maxLength;
    }  
}
