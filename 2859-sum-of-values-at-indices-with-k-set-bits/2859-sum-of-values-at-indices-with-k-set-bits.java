class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0 ; 
        int[] store = new int[nums.size()+1];
        store[0] = 0;
        for(int i = 1; i < nums.size(); i++){
            store[i] = store[i>>1] + (i&1);
            if(store[i] == k){
                ans +=nums.get(i);
            }
        }
        return ans;
    }
}