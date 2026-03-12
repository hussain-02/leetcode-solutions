class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int cnt = 0 ;
        int l = 0 ; 
        int r = p.length - 1;
        while(l <= r){
            int sum = p[l] + p[r];

            if(sum <= limit){
                l++;
                r--;
                cnt++;
            } else if(sum > limit){
                cnt++;
                r--;
            }
        }
        return cnt;
    }
}