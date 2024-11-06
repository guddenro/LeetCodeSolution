class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length <3) return new ArrayList<>();

        List<List<Integer>> result  = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i <nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int j = i+1;
            int k = nums.length -1;

            while(j < k){
                  if(nums[j]+nums[k] > target){
                    k--;
                  } else if(nums[j]+nums[k] < target){
                    j++;
                  } else{
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j <k && nums[j] == nums[j+1]) j++;
                    while(j <k && nums[k] == nums[k-1]) k--;
                    
                    j++;k--;
                  }

            }


        }
        return result;
    }
}