class Solution {
    public boolean check(String s , int l , int r){
        while(l <= r){
            if(s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }else return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int cnt =0;
        for(int i = 0 ; i < s.length() ; i++){
           for(int j = i + 1 ; j < s.length() ; j++){
            boolean sub =  check(s,i,j);
            if(sub) cnt++;
           }
           cnt++;
        }

        return cnt;
    }
}