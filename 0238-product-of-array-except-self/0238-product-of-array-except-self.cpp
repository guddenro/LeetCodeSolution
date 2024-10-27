class Solution {
public:
    vector<int> productExceptSelf(vector<int>& a) {
        
        int n = a.size();
        
        vector<int>prod(n,0);
        
        prod[0]= 1;
        for(int i = 1; i <n ; i++){
            prod[i] = prod[i-1]*a[i-1];
            
        }
        
        int right = 1;
        
        for(int i= n-1; i>=0 ; i--){
            
            prod[i] = prod[i]*right;
            
            right *= a[i];
        }
        
        
        return prod;
    }
};