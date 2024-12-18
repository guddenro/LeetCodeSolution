class Solution {
    public boolean divideArray(int[] nums) {
       
        // int xor = 0;
        // Arrays.sort(nums);
        // for(int i = 0 ; i < nums.length-1 ; i+=2){
        //     if(nums[i] != nums[i+1]) return false;
        // }
        // return true;
        int freq[] = new int[501];
        
        //count freuency
        //O(N)
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        
        //check if frequency is even or not
        //O(500) - O(1)
        for (int f : freq) {
            if (f % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}

