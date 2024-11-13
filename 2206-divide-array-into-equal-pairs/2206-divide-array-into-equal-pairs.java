class Solution {
    public boolean divideArray(int[] nums) {
       
        int xor = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i+=2){
            if(nums[i] != nums[i+1]) return false;
        }
        return true;
    }
}

