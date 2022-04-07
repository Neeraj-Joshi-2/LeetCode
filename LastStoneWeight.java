//Priority Queue

class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int elem : stones){
            pQueue.offer(elem) ;
        }
        int max1 ;
        int max2 ;
        while(pQueue.size()>1){
            max1 = pQueue.poll() ;
            max2 = pQueue.poll() ;
            if(max1>max2){
                pQueue.add(max1-max2) ;
            }
        }
        if(pQueue.size() == 0) return 0;
        return pQueue.poll();
    }
}

//ArrayList

class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        for(int elem : stones){
            list.add(elem) ;
        }
        Collections.sort(list) ;
        
        while(list.size()!=1){
            int max1 = Collections.max(list) ;
            list.remove(new Integer(max1)) ;
            int max2 = Collections.max(list) ;
            list.remove(new Integer(max2)) ;
            int dif = max1-max2 ;
            list.add(dif) ;
        }
        
        return list.get(0);   
    }
}
