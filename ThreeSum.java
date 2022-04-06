class ThreeSum {
    public int threeSumMulti(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr) ;
        int ans = 0; 
        int mod = 1000000007;
        for (int i=0; i<n-2; ++i) {
            int lo = i+1, hi = n-1;
            while (lo < hi) {
                if (arr[i] + arr[lo] + arr[hi] == target) {
                    int cntlo=1, cnthi=1;
                    while (lo < hi && arr[lo] == arr[lo+1]) {cntlo++; lo++;}
                    while (lo < hi && arr[hi] == arr[hi-1]) {cnthi++; hi--;}
					// A[lo]==A[hi]
                    if (lo == hi) ans =(ans+cntlo*(cntlo-1)/2)%mod;
					// A[lo]!=A[hi]
                    else ans = (ans+cntlo*cnthi)%mod;
                    lo++; hi--; 
                } else if (arr[i] + arr[lo] + arr[hi] > target) {
                    hi--;
                } else {
                    lo++;
                }
            }
        }
        return ans;
    }
};



