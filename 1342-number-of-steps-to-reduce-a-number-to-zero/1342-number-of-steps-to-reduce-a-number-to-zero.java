class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;

        while(num>0){
            if(((1&num)) == 1){
               num--;
            }else{
                num = num>>1;
            }
           steps++;
        }
        return steps;
        
    }
}