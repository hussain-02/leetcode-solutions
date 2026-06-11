class Solution {
    public void sortColors(int[] nums) {
        int i = 0 ;
        int j = 0;
        int r = nums.length-1;

        while(j<=r){
            if(nums[j] == 2){
                int temp = nums[r];
                nums[r] = nums[j];
                nums[j] = temp;
                r--;
            }
            else if(nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
}