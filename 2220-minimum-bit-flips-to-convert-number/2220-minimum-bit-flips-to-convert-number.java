class Solution {
    public int minBitFlips(int start, int goal) {
        //https://leetcode.com/problems/number-of-1-bits/description/
        // int ans = 0;
        // for(int i = 0 ; i < 32; i++){
        //     if( (( (start>>i)&1)) !=   (((goal>>i)&1)) ){
        //         ans++;
        //     }
        // }

        // return ans;

         int ans = 0; 
        // XOR will give 1 where the bits are different
        int xor = start ^ goal;

        while(xor!=0){
            // If the last bit is 1, increment count 
            ans += xor & 1;

            // Right-shift to check the next bit
            xor >>=1;
        }
        return ans;
    }
}