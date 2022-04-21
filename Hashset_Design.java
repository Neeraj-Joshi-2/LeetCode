class Hashset_Design {
    boolean[] arr = new boolean[100];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(key>=arr.length) 
            extend(key);
        arr[key]=true;
    }
    
    public void remove(int key) {
        if(key>=arr.length) 
            extend(key);
        arr[key]=false;
    }
    
    public boolean contains(int key) {
        if(key>=arr.length) 
            return false;
        return arr[key]==true;
    }
    
    public void extend(int key){
        arr= Arrays.copyOf(arr, key+2);  
    }
}
