class Solution {
    public void sortColors(int[] nums) {
        int n =  nums.length;
        int l = 0 , mid = 0  ,h =n - 1; 
        while(mid <= h){
            if(nums[mid] == 0){
                swap(nums,l,mid);
                l++;
                mid++;
            }else if(nums[mid] == 1){
               mid++;
            }else{
                 swap(nums,mid,h);
                h--;
            }
        }
    }
    public void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}