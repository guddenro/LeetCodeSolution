class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] b1 = new boolean[101];
        boolean[] b2 = new boolean[101];
        boolean[] b3 = new boolean[101];
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < nums1.length ; i++)
            b1[nums1[i]] = true;
        for(int i = 0 ; i < nums2.length ; i++)
            b2[nums2[i]] = true;
        for(int i = 0 ; i < nums3.length ; i++)
            b3[nums3[i]] = true; 
        
        for(int i = 0 ; i < 101 ; i++){
            if((b1[i] && b2[i]) || (b2[i] && b3[i]) || (b3[i] && b1[i])){
                res.add(i);
            }
        }
        return res;
    }
}