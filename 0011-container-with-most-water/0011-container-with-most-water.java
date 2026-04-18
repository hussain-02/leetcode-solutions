class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int maxArea = Integer.MIN_VALUE;
        int l = 0 ; 
        int r = n - 1;
        while(l < r){
            int currArea = (r - l) * Math.min(h[l],h[r]);
            maxArea = Math.max(maxArea,currArea);

            if(h[l] >= h[r]){
                r--;
            }else{
                l++;
            }
        }
        return maxArea;
        // int maxCurr = Integer.MIN_VALUE;
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = i+1 ; j < n ; j++){
        //         int curr = (j - i) * Math.min(h[i],h[j]);
        //         maxCurr = Math.max(curr,maxCurr);
        //     }
        // }

        // return maxCurr;
    }
}