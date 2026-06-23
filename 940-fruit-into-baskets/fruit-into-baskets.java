class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0 ;
        int ans = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int right = 0 ; right < fruits.length ; right++){
            hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);

            while(hm.size() > 2){
                hm.put(fruits[left] , hm.getOrDefault(fruits[left],0)-1);
                if(hm.get(fruits[left]) == 0) hm.remove(fruits[left]);
                left++;
            }

            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}