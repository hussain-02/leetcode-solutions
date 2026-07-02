class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] heights = new int[col];
        int maxArea = 0;
        for(int i = 0 ; i < row;i++){
            for(int j  = 0 ; j < col ;j++){
                if(matrix[i][j] == '1'){
                    heights[j] += 1;
                }else{
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea,longest(heights));
        }
        return maxArea;
    }

    public int longest(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i = 0 ; i <= heights.length ; i++){
            int h = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty() && h < heights[stack.peek()]){
                int height = heights[stack.pop()];

                int width = (stack.isEmpty()) ? i : (i - stack.peek() - 1);


                int area = height * width;

                max = Math.max(max,area);
            }
            stack.push(i);
        }
        return max;
    }
}