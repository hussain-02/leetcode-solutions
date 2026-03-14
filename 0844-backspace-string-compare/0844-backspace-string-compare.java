class Solution {
    public boolean backspaceCompare(String s, String t) {

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        int ss = processString(sarr);
        int tt = processString(tarr);

        if(ss != tt) return false;

        for(int i = 0; i < ss; i++){
            if(sarr[i] != tarr[i]) return false;
        }

        return true;
    }

    public int processString(char[] chars){

        int k = 0;

        for(char c : chars){

            if(c != '#'){
                chars[k++] = c;
            }
            else if(k > 0){
                k--;
            }
        }

        return k;
    }
}