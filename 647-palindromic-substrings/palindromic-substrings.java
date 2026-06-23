class Solution {
    public int countSubstrings(String s) {
        int cnt = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i++ ){
            for(int j =  i ; j < n ; j++){
                if(palindrome(s,i,j)) cnt++;
            }
        } 
        return cnt;
    }

    public boolean palindrome(String s , int l , int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true ;
    }
}