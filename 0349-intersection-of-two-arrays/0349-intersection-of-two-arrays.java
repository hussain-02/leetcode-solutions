class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums1){
            for(int j : nums2){
                if(i == j){
                    set.add(i);
                    break;
                }  
            }
        }


        int ans[] = new int[set.size()];
        int k = 0;
        for(int i : set){
            ans[k++] = i;
        }
        return ans;
    }
}