class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = Integer.MIN_VALUE;

        while(left < right){
            int width = Math.min(height[left],height[right]);
            int currArea = width  * ( right - left);

            if(currArea > maxArea){
                    maxArea = currArea;
                }

                if(height[left] > height[right]){
                    right--;
                }else{
                    left++;
                }

        }
        return maxArea;

        // int n = height.length;
        // int maxArea = Integer.MIN_VALUE;
        
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = i + 1 ; j < n ; j++){
        //         int width = Math.min(height[i],height[j]);
        //         int currArea = width  * ( j - i);

        //         if(currArea > maxArea){
        //             maxArea = currArea;
        //         }

        //     }
        // }
        // return maxArea;
    }
}