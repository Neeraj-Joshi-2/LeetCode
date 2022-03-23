class Solution {
    public int brokenCalc(int startValue, int target) {
        int x=2,count=0;
        while(target>startValue){
            if(target%2!=0){
                target+=1;
                count++;
            }
            else{
                target=target/2 ;
                count++ ;
            }  
        }
        return count + (startValue - target);
    }
}
