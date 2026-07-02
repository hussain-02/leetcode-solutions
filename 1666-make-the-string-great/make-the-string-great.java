class Solution {
    public String makeGood(String s) {

        if(s.length()<= 1) return s;
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){

            if(!stack.isEmpty() && (((char)stack.peek()+ 32) == ch) || !stack.isEmpty() && (((char)stack.peek()- 32) == ch)){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        for(char  c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}