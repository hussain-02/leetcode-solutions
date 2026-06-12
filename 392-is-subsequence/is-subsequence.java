class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() <1) return true;
        int i = 0 ;
        int j = 0;

        while(j < t.length()){
            char c = s.charAt(i);
            char ch = t.charAt(j);
            if(c == ch){
                i++;
            }
            j++;
            if(i == s.length()) return true;
        }

        if(i == s.length()) return true;

        return false;
    }
}