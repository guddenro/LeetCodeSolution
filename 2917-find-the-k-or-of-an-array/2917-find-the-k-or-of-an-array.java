class Solution {
    public int findKOr(int[] nums, int k) {
        int out = 0;
        for(int i = 0 ; i< 32; i++){
            int count = 0;
             // System.out.println(i);
            for(int j  = 0 ; j < nums.length; j++){
                if( ((nums[j]>>i)&1) == 1)  count++;
            }
           // System.out.println(count);
            if(count >= k){
                System.out.println(i);
                out += 1 << i;
            }
        }

        return out;
    }
}