class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
         int n = nums.length;
         int pro = 1;
         int cnt = 0;


         for(int i = 0 ; i < n ; i++){
            pro =1;
            for(int j = i ; j >= 0 ; j--){
                pro *= nums[j];

                if(pro < k) cnt++;
                else break;
            }
         }


         return cnt;
        
    }
}