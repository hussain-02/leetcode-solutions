class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for(int i : nums1){
            set1.add(i);
        }

        for(int i : nums2){
            set2.add(i);
        }

        int n1 = set1.size();
        int n2 = set2.size();
        
        int idx = 0;
        List<Integer> l = new ArrayList<>();
        for(int i : set1){
            if(set2.contains(i)) l.add(i);
        }
        int res[] = new int[l.size()]; 

        for(int i : l){
            res[idx++] = i;
        }

        return res;
    }
}