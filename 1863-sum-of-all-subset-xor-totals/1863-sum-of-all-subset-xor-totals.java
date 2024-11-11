class Solution {
    public int subsetXORSum(int[] nums) {
        return XOR(nums, 0 , 0);
       
    }

    public int XOR(int[] nums, int index, int result){
        if(nums.length == index) return result;

        int withElement  = XOR(nums, index+1 , nums[index]^result);
        int withoutElement  = XOR(nums, index+1 , result);

        return withElement+withoutElement;
    }

   
}