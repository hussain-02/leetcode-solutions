class Solution {
    public int[] twoSum(int[] n, int t) {
        int l = 0;
        int len = n.length;
        int r = len - 1;

        while(l < r){
            int sum = n[l] + n[r];

            if(sum < t) l++;
            else if( sum > t) r--;
            else{
                return new int[]{l+1,r+1};
            }
        }
        return new int[]{-1,-1};
    }
}