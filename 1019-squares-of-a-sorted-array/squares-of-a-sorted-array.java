class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = n - 1;

        while(left <= right){
            int leftVal = Math.abs(nums[left]);
            int rightVal = Math.abs(nums[right]);

            if(leftVal < rightVal){
                res[idx] = rightVal * rightVal;
                right--;
            }else{
                res[idx] = 
                leftVal * leftVal;
                left++;
            }

            idx--;
        }
        return res;
    }
}