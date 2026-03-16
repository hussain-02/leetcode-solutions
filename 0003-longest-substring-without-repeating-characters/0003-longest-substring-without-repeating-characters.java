class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ; 
        Set<Character> set = new HashSet();
        int maxLength = 0;
        for(int rigth = 0 ; rigth < s.length() ; rigth++){

            while(set.contains(s.charAt(rigth))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(rigth));
            maxLength = Math.max(maxLength,(rigth - left + 1));
        }

        return maxLength;
    }
}