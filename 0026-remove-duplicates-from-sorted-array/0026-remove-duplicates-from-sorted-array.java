class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0 ;
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++ ){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i + 1;
        // Set<Integer> set = new HashSet<>();

        // for(int i : nums){
        //     set.add(i);
        // }

        // int k = set.size();
        // List<Integer> l = new ArrayList<>(set);
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(i < k){
        //         nums[i] = l.get(i);
        //     }else{
        //         nums[i] = 0;
        //     }
        // }
        // return k;
    }
}