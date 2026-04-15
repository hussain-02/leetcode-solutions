class Solution {
    public int[] twoSum(int[] n, int t) {
        int l = 0 ;
        int len = n.length;
        int r = len - 1;
        while(l <= r){
            if((n[l]+n[r]) > t) r--;
            else if((n[l]+n[r]) < t) l++;
            else if((n[l]+n[r]) == t) return new int[]{l+1,r+1};
        }
        return new int[]{-1,-1};
}
}