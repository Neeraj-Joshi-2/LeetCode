class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>() ;
        int [] ans = new int[k] ;
        for(int elem : nums){
            if(map.containsKey(elem)){
                map.put(elem, map.get(elem) + 1);
            }
            else{
                map.put(elem,1) ;
            }
        }
        
        int temp=1,idx=0 ;
        while(temp<=k){
            int max_ = (Collections.max(map.values()));
            for(Integer i : map.keySet()){
                if (map.get(i)==max_) {
                    ans[idx++] = i ;
                    map.remove(i) ; 
                     break ;
                }  
            }
            temp++ ;
        }
       return ans ; 
    }
}
