class PartitionLabel {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>(); 
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i) ;
        }
        int maxIdx=0,idx=-1 ;
        for(int i = 0 ; i < s.length() ; i++){
            int val = map.get(s.charAt(i)) ;
            if(val>maxIdx){
                maxIdx=val ;
            }
            if(i==maxIdx){
                list.add(maxIdx-(idx)) ;
                idx = maxIdx ;
            }
        }
        return list ;
    }
}
