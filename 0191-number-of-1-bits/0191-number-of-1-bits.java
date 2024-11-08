class Solution {
    // public int hammingWeight(int n) {
    // int ans = 0;
    // while(n != 0){
    
    // ans += n&1;

    // n = n>>>1;
    // }

    // return ans;

    // }
    public int hammingWeight(int n) {
    int ans = 0;
    for(int i = 0 ; i < 32 ; i++){
    if(((n>>i)&1) == 1)
    ans++;
    }

    return ans;

    }
}