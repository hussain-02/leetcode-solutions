class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        String res ="";

        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                if(palindromic(s,i,j) == true){
                    if( (j - i + 1) > res.length()){
                        res = s.substring(i,j+1);
                    }
                }
            }
        }

        return res;
    }

    public boolean palindromic(String s , int i , int j ){
        while( i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}