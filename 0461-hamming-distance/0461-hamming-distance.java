class Solution {
    public int hammingDistance(int x, int y) {
        // int count = 0;
        // for(int i = 0 ; i < 32; i++){
        //     if( ((x>>i)&1) !=   ((y>>i)&1)){
        //         count++;
        //     }
        // }
        // return count;

        int res = 0;
    int m = x^y;                  // take the xor of two numbers
    while(m != 0){                // count the no of "1"s 
        if((m&1) == 1)
            res++;
        m = m>>1;
    }
    return res;
    }
}