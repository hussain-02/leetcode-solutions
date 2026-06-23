class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return atMost(nums,k) - atMost(nums,k-1);

        // int cnt = 0;
        // int n = nums.length;

        // for(int i = 0 ; i < n ; i++){
        //     Map<Integer,Integer> hm = new HashMap<>();
        //     for(int j = i ; j < n ; j++){
        //         hm.put(nums[j] , hm.getOrDefault(nums[j],0)+1);

        //         if(hm.size() == k) cnt++;
        //         else if(hm.size() > k ) break;
        //     }
        // }

        // return cnt;
    }


    public int atMost(int[] nums,int k ){
        int cnt = 0;
        Map<Integer,Integer> hm = new HashMap<>();

        int left = 0;

        for(int right = 0 ; right  < nums.length ; right++){

            hm.put(nums[right] , hm.getOrDefault(nums[right],0) + 1);

            while(hm.size() > k){
                hm.put(nums[left] , hm.get(nums[left]) - 1);
                if(hm.get(nums[left]) == 0) hm.remove(nums[left]);
                left++;
            }
            cnt += right - left + 1;
        }

        return cnt;

    }
}