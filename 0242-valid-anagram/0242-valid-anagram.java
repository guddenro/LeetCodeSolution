class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length() != t.length()) return false;
        Map<Character, Integer> anaCheck = new HashMap<>();

        for(char c : s.toCharArray()) {
        anaCheck.put(c, anaCheck.getOrDefault(c,0)+1 );
        }

        for(char c : t.toCharArray()) {
        anaCheck.put(c, anaCheck.getOrDefault(c,0)-1 );
        }

        for(int i: anaCheck.values()){
            if(i !=0) return false;
        }
        return true;

        
    }
}