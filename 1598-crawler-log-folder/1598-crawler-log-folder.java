class Solution {
    public int minOperations(String[] logs) {
          Stack<String> ss = new Stack<>();
        for(String s : logs){
            if("../".equals(s)){
                if(ss.isEmpty()) continue;
                else ss.pop();
            }else if(!"./".equals(s)) ss.push(s);
        }
        return ss.size();
    }
}