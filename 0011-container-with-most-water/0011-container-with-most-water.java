class Solution {
    public int maxArea(int[] h) {


        int len = h.length;
        int l = 0 ; 
        int r = len - 1;
        int maxArea = Integer.MIN_VALUE;

        while(l < r){
         int  w = r - l;
         int currArea = Math.min(h[l],h[r]) * w;
         if(h[l] < h[r]) l++;
         else if(h[l] == h[r]){
            l++;
            r--;
         } else r--;
            maxArea = Math.max(maxArea,currArea);
        }
        return maxArea;
        // int len = h.length;
        // int mA = Integer.MIN_VALUE;
        // for(int i = 0 ; i < len ; i++){
        //     for(int j = i + 1 ; j < len ; j++){
        //         int w = j - i ;
        //         int cA = Math.min(h[i],h[j]) * w;
        //         mA = Math.max(cA,mA);
        //     }
        // }
        // return mA;
    }
}


// class Solution {
//     public int maxArea(int[] height) {
//         int n = height.length,mA=0;
//         int left = 0 ,right=n-1; 
//         while(left<right){
//             int w = right - left;
//             int cA=Math.min(height[left],height[right])*w;
//             mA=Math.max(mA,cA);
//             if(height[left]<height[right]) ++left;
//             else if(height[left] == height[right]){
//                 left++;
//                 right--;
//             }
//             else --right;
//         }
//         return mA;
//         //TC:O(n^2) ||SC:O(n ) 
//         // int maxArea =0 , n = height.length;
//         // for(int i = 0 ; i < n ; i++) {
//         //     for(int  j = i+1;j<n ; j++){
//         //         int width = j - i ;
//         //         int currArea = Math.min(height[i],height[j])*width;
//         //         maxArea=Math.max(maxArea, currArea);
//         //     }
//         // }
//         // return  maxArea;
//     }