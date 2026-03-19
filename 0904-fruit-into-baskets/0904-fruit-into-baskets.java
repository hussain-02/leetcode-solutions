class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int ans = 0 ;
        int l = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int r = 0 ; r < n ; r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);

            while(hm.size() > 2){
            hm.put(fruits[l],hm.getOrDefault(fruits[l],0)-1);

            if(hm.get(fruits[l]) == 0) hm.remove(fruits[l]);

            l++;
            }


            ans = Math.max(ans,(r - l + 1));
        }

        return ans;
        // int max = 0;
        // for(int l = 0 ; l < n ;l++ ){
        //     Map<Integer,Integer> hm = new HashMap<>();
        //     int cnt = 0;
        //     for(int r = l ; r < n ; r++){
        //         hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);

        //         if(hm.size() > 2) break;

        //         cnt++;
        //     }

        //     max = Math.max(max,cnt);
        // }

        // return max;
    }
}