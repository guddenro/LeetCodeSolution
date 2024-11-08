class Solution {
    // public int[] countBits(int n) {
    //     int[] ans = new int[n+1];
    //     int offset = 1;
    //     ans[0] = 0;
    //     for(int i = 1; i <= n ; i++){
    //         if(offset*2 == i) offset = i;
    //         ans[i] = 1+ans[i-offset]; 
    //     }
    //     return ans;
    // }

      public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i = 1; i <= n ; i++){
            ans[i] = ans[i>>1] + (i&1);
        }
        return ans;
    }
}