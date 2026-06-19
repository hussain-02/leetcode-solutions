class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String str){

        Stack<Character> ans = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch != '#') ans.push(ch);
            else if(!ans.empty()){
                ans.pop();
            }
        }

        return String.valueOf(ans);
    }
}