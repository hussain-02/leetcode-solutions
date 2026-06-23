class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] >= k ) continue;
            int product = 1;
            for(int j = i  ; j < nums.length ; j++){
                product = product *  nums[j];
              //  System.out.println(product +" " + nums[i]);
                if(product >= k) break;
                else cnt++;
            }
           
        }
        return cnt;
    }
}