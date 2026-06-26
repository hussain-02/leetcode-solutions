class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> hm = new HashMap<>();
        String ans= "";
        int count = t.length();
        int maxLen = Integer.MAX_VALUE;
        for(char ch : t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int left = 0 ;
        for(int right = 0 ;right < s.length();right++){
            char ch = s.charAt(right);

            if(hm.containsKey(ch)){
                if(hm.get(ch) > 0) count--;
                hm.put(ch,hm.get(ch)-1);
                
            }
            while(count == 0 ){
                if((right - left + 1) < maxLen){
                    maxLen = (right - left + 1);
                    ans = s.substring(left,right+1);
                }

                char leftChar = s.charAt(left);
                if(hm.containsKey(leftChar)){
                    hm.put(leftChar,hm.get(leftChar)+1);
                    if(hm.get(leftChar) > 0) count++;
                }
                left++;

                
            }
        }
        return ans;
    }
}