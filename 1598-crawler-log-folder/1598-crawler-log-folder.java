class Solution {
    public int minOperations(String[] logs) {
        int k = 0;
        for(String s : logs){
            if("../".equals(s)){
                if(k == 0) continue;
                else k--;
            }else if("./".equals(s)) continue;
            else k++;
        }
        return k;
    }
}