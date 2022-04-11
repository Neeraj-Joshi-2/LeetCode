class Shift2dGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>() ;
        int n = grid.length ;
        int m = grid[0].length ;
        int[][] list_ = new int[n][m] ;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int newJ=(j+k)%m;              
                int newI=(i+(j+k)/m)%n;             
                list_[newI][newJ]=grid[i][j];
            }
        }
        for (int[] arr : list_) {
            ArrayList<Integer> l = new ArrayList<Integer>() ;
            for(int elm : arr){
                l.add(elm) ;
            }
            list.add(l) ;
        }
        return list ;
    }
}
