class Solution {
    public int[] evenOddBit(int n) {
        // int even =  0, odd =0;
        // for(int i = 0 ; i <32 ; i++){
        //     if( ((n>>i) & 1) ==1 && i%2 ==0 ){
        //         even++;
        //     } else if( ((n>>i) & 1) ==1 && i%2 !=0 ){
        //         odd++;
        //     } 
        // }
        // return new int[]{even, odd};

        int n1 = 0;
        int n2 = 0;
        if(n == 0) return new int[]{0, 0};
        int idx = 0;
        
        while(n > 0) {
            if(idx % 2 == 0) {
                if((n & 1) == 1) n1++;
            }
            else {
                if((n & 1) == 1) n2++;
            }
            idx++;
            n = (n >> 1);
        }
        
        return new int[]{n1, n2};
    
    }
}