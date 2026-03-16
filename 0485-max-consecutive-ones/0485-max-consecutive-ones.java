class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int j = 0 ;
       int maxOnes = Integer.MIN_VALUE;
        int currCon = 0;
       while( j < nums.length){
        if(nums[j] == 1){
            currCon++;
        }else{
            maxOnes = Math.max(maxOnes,currCon);
            currCon = 0;
        }
        j++;
       } 
       return Math.max(maxOnes,currCon);
    }
}