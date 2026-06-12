class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1 ; j < n ; j++){
                if( (j - 1) != i && nums[j] == nums[j-1]) continue;
                int l = j + 1;
                int r = n -1;
                while(l < r){
                     long sum = (long)nums[i] + (long)nums[j] + (long)nums[l] + (long)nums[r];

                    if(sum == t){
                        ans.add(Arrays.asList(nums[i] ,nums[j] , nums[l] ,nums[r]));

                        while(l < r && nums[l] == nums[l+1]) l++;
                        while(l < r && nums[r] == nums[r-1]) r--;
                        l++;
                        r--;
                    }else if(sum < t) l++;
                    else r--;
                }
            }
        }
        return ans;
    }
}