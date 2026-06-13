class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;

        while(l < r){
            if(nums[l] % 2 != 0 ){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
            }else{
                l++;
            }
        }
        return nums;
    }
}