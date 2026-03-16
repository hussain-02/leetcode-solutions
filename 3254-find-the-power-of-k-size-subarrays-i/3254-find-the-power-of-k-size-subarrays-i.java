class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;

        int[] res = new int[n - k + 1];
        int i = 0 ; 
        int j = 0;
        int index = 0 ;
        while( j < n){
            if((j - i + 1) == k){
                if(check(nums,i,j)){
                    res[index] = nums[j];
                }else res[index] = -1;
                index++;
                i++;
                j++;

            }else if((j - i + 1) < k) j++;
        }
        return res;
    }

    public boolean check(int[] nums , int s, int e){
        for(int i  = s ; i < e ; i++){
            if(nums[i] + 1 != nums[i + 1]) return false;
        }
        return true;
    }
}