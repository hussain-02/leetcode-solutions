class Solution {
    public int numRescueBoats(int[] p, int l) {
        int minBoat = 0;
        int n = p.length;
        Arrays.sort(p);

        int left = 0;
        int right= n - 1;

        while(left <= right){
            int sum = p[left] + p[right];

            if(sum <= l){
                minBoat++;
                left++;
                right--;
            }else {
                minBoat++;
                right--;
            }
        }
        return minBoat;
    }
}