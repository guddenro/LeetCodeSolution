class Solution {
    //count no of 1.
    // public boolean isPowerOfTwo(int n) {
    //      if (n <= 0) {
    //         return false;
    //     }
    //     int countOne = 0;
    //     for(int i = 0 ; i < 32; i++){
    //         if(((n >> i) & 1) == 1){
    //             countOne++;
    //         }
    //     }

    //     if(countOne == 1) return true;
    //     else return false;
    // }

    //  public boolean isPowerOfTwo(int n) {
    //     if(n<=0){
    //         return false;
    //     }
    //     return (n & (n-1)) ==0;
    // }

    //  public boolean isPowerOfTwo(int n) {
    //      for (int i = 0; i < 31; i++) {
    //         int ans = (int) Math.pow(2, i);
    //         if (ans == n) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        return (n % 2 == 0) && isPowerOfTwo(n / 2);
    }
  
}

