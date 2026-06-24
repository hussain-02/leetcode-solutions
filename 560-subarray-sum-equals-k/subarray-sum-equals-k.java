class Solution {
    public int subarraySum(int[] nums, int k) {
        int perfixSum = 0 ;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int cnt = 0;
        for(int i : nums){
            perfixSum += i;

            if(hm.containsKey(perfixSum-k)){
                cnt += hm.get(perfixSum-k) ;
            }
            hm.put(perfixSum,hm.getOrDefault(perfixSum,0)+1);
        }
        return cnt;
    }
}