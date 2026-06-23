class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCon = 0;
        int cnt = 0; 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                cnt++;
            }else{
                maxCon = Math.max(maxCon,cnt);
                cnt = 0;
            }
        }
         maxCon = Math.max(maxCon,cnt);

         return maxCon;
    }
}