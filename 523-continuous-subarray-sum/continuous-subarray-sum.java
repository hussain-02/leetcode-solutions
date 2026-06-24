class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();

        hm.put(0,-1);
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];

            int rem = sum % k;

            if(hm.containsKey(rem)){
                if(i - hm.get(rem) >= 2) return true;
            }else{
                hm.put(rem,i);
            }
        }

        return false;




        // int n = nums.length;
        // int sum = 0 ;
        // int left  = 0;
        // for(left = 0 ; left < n ; left++){
        //     sum = nums[left];
        //     for(int right = left + 1 ; right < n ;right++){
        //         sum += nums[right];
        //         if( sum % k == 0){
        //             return true;
        //         }
        //     }
        // }
        

        // return false;
    }
}