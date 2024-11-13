class Solution {
    public boolean divideArray(int[] nums) {
       
        int xor = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            xor = nums[i]^nums[i+1];
        }
        
        System.out.println(xor);
        return (xor==0? true:false);
    }
}

