class Solution {
    public String removeStars(String s) {
        char ch[] = s.toCharArray();
        int k = 0;
        for(char c : ch){
            if(c != '*'){
                ch[k++] = c;
            }else{
                k--;
            }
        }

        return new String(ch,0,k);
    }
}