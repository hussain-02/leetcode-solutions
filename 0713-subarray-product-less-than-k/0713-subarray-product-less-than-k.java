class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1) return 0;
         int n = nums.length;
         int pro = 1;
         int cnt = 0;
         int left = 0;

         for(int r = 0 ; r < n ; r++){
            pro *= nums[r];

            while(pro >= k){
                 pro /= nums[left];
                 left++;
            }

            cnt += (r - left + 1);
         } 
         return cnt;

        // if(k <= 1) return 0;
        //  int n = nums.length;
        //  int pro = 1;
        //  int cnt = 0;


        //  for(int i = 0 ; i < n ; i++){
        //     pro =1;
        //     for(int j = i ; j >= 0 ; j--){
        //         pro *= nums[j];

        //         if(pro < k) cnt++;
        //         else break;
        //     }
        //  }


        //  return cnt;
        
    }
}