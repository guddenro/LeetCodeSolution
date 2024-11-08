class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedChars= new HashSet<>();
        for(int i = 0 ;  i <allowed.length() ; i++){
            allowedChars.add(allowed.charAt(i));
        }
        int consistentCount = 0;
      
        for(String word: words){
              boolean flag = true;
            for(int i = 0 ; i < word.length() ; i++){
                if(!(allowedChars.contains(word.charAt(i)) ) ) {
                    flag = false;
                    break;
                }
            }
            if(flag) consistentCount++;
            
        }
        return consistentCount;
    }
}