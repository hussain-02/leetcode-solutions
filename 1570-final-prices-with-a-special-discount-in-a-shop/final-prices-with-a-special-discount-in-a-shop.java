class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
       // ans[n-1] = prices[n-1];
        for(int i = n - 1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && prices[i]  < stack.peek()){
                stack.pop();
            }
            ans[i] = (stack.isEmpty()) ? prices[i] : prices[i] - stack.peek();
            stack.push(prices[i]);
        }

        return ans;
    }
}