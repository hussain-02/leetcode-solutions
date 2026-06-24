class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int cnt = 0;

        int n = nums.length;

        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            int rem = sum % k;

            if( rem < 0) rem += k;

            if(hm.containsKey(rem)){
                cnt += hm.get(rem);
            }

            hm.put(rem, hm.getOrDefault(rem,0)+1);
        }
        return cnt;
        // int cnt = 0;
        // int n = nums.length;

        // for(int l = 0 ; l < n ; l++){
        //     int sum = 0;
        //     for(int r = l ; r < n ;r++){
        //         sum += nums[r];
        //         if(sum % k == 0) cnt++;
                                
        //     }
        // }

        // return cnt;
    }
}