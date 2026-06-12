class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int slow = 0;
        for(int fast = 0 ; fast < nums.length ; fast++){
            if(nums[fast] == val) continue;
            

            nums[slow++] = nums[fast]; 
        }

        return slow;
    }
}