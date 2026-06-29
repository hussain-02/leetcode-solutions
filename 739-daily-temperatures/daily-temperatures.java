class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();

        int n = t.length;

        int[] res = new int[n];

        for(int i = n -1 ; i >= 0 ; i--){

            while(!stack.isEmpty() && t[stack.peek()] <= t[i]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                res[i] = stack.peek() - i;
            }else{
                res[i] = 0;
            }

            stack.push(i);
        }

        return res;

    }
}