class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hm1 = new HashSet<>();
        Set<Integer> hm2 = new HashSet<>();
        for(int i  : nums1){
            hm1.add(i);
        }
        for(int i  : nums2){
            hm2.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for(int i : hm1){
            if(hm2.contains(i))list.add(i);
        }

        int n = list.size();

        int[] ans= new int[n];

        for(int i = 0 ; i < n ; i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}