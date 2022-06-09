class TwoSumSortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2] ;
        int start=0,end=numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]>target) end--;
            else if(numbers[start]+numbers[end]<target) start++;
            else{
                arr[0]=start+1;
                arr[1]=end+1;
                return arr;
            } 
        }
        return arr;
    }
}
