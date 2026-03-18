class Solution {
    public int longestOnes(int[] nums, int k) {
        int cntZero = 0;
        int left = 0;

        for(int right = 0 ; right < nums.length ; right++ ){
            if(nums[right] == 0) cntZero++;

            if(cntZero > k){
                if(nums[left] == 0) cntZero--;
                left++;
            }
        }

        return nums.length - left;
        // int cntZero = 0 ;        O(2N)---->TC 
        // int maxLength = 0;
        // int left = 0;

        // for(int right = 0 ; right < nums.length ; right++){
        //     if(nums[right] == 0) cntZero++;

        //     while(cntZero > k){
        //         if(nums[left] == 0) cntZero--;
        //         left++;
        //     }

        //     maxLength = Math.max(maxLength,right - left + 1);
        // }

        // return maxLength;



        // int cntZero = 0 ;
        // int maxCnt = 0;
        // for(int left = 0 ; left < nums.length ; left++){
        //     for(int right = left ; right < nums.length ; right++){
        //         if(nums[right] == 0 ){
        //             cntZero++;
        //         }

        //         if(cntZero > k){
        //             maxCnt = Math.max(maxCnt,right - left);
        //             cntZero = 0;
        //             break;
        //         }
        //     }
        // }
        //  return maxCnt;
    }
}