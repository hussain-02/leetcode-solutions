class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int i = 0;
      //  int j = 0;
        while(i < nums.length ){
            int s = nums[i];
            int j = i;
            while(j + 1 < nums.length && nums[j] + 1 == nums[j + 1]) j++;


            if(nums[j] == s){
                res.add(String.valueOf(s));
            }else res.add(s + "->" + nums[j]);


            i = j + 1;
        } 

        return res;
    }
}