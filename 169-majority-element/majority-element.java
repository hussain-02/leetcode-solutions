class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0 , canditate = 0 ;

        for(int  i : nums){
            if(cnt == 0 ){
                cnt = 1;
                canditate = i;
            }else if(canditate == i) cnt++;
            else cnt--;
        }

        cnt= 0;
        for(int i : nums){
            if(canditate == i) cnt++;
        }

        if(cnt > nums.length / 2) return canditate;

        return -1;
    }
}