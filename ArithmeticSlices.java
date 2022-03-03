class ArithmeticSlices {
    public static int numberOfArithmeticSlices(int[] A) {
        int curr = 0, sum = 0;
        for (int i = 2; i < A.length; i++)
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                curr += 1;
                sum += curr;
            } 
            else {
                curr = 0;
            }
        return sum;
    }
    
    public static int numberOfArithmeticSlice(int[] nums) {
        int count;
        int res=0;
        if(nums.length<3)
            return 0;
        for(int i=0; i<nums.length-2;i++){
            count = nums[i+1]-nums[i];
            for(int j=i+2; j<nums.length; j++){
                if(nums[j]-nums[j-1]!=count)
                    break;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(numberOfArithmeticSlices(arr));
    }
}
