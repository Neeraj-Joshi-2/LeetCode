class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int cost = 0;
        ArrayList<Integer> list = new ArrayList<Integer>() ;    
        
        for (int[] arr : costs){
            cost+=arr[0] ;
            list.add(arr[1]-arr[0]) ;
        }     
        
        Collections.sort(list) ;   
        
        for(int i=0 ; i<costs.length/2 ; i++){
            cost+=list.get(i) ;
        }    
		
        return cost ;
    }
}
