class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();

        for(int i : asteroids){
            list.add(i);
        }

        int i = 0;
        int a = 0;
        int b = 0;
        while(i < list.size() - 1){
            a = list.get(i);
            b = list.get(i + 1);

            if(a > 0 && b < 0){
                if(Math.abs(a) > Math.abs(b)){
                    list.remove(i+1);
                }else if(Math.abs(a) < Math.abs(b)){
                    list.remove(i);
                    if(i > 0) i--;
                }else{
                    
                    list.remove(i + 1);
                    list.remove(i);
                    if(i > 0) i--;
                }
            }else{
                i++;
            }
        }
        int ans[] = new int[ list.size()];
            for( i = 0 ; i < list.size() ; i++){
                ans[i] = list.get(i);
            }
            return ans;
    }
}