class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int left = 0 ; 
        int right = n - 1;

        int leftMax = h[left];
        int rightMax = h[right];

        int water = 0;
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(h[left],leftMax);
                water += leftMax - h[left];
            }else{
                right--;
                rightMax = Math.max(h[right],rightMax);
                water += rightMax - h[right];
            }
        }

        return water;
    }
}