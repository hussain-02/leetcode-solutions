class Solution {
    public String removeStars(String s) {
        int k = 0; 
        char[] chars = s.toCharArray();
        for(char c : chars ){
            if(c != '*'){
                chars[k++] = c;
            }else{
                k--;
            }
        }

        return new String(chars, 0, k);
    }
}