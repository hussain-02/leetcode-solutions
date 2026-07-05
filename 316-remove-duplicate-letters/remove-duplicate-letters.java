class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] visted = new boolean[26];

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for(int  i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(visted[ch - 'a']) continue;

            while(!sb.isEmpty() && sb.charAt(sb.length() - 1) > ch && 
            lastIndex[sb.charAt(sb.length() - 1 ) - 'a'] > i){
                visted[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);

            }
            sb.append(ch);

            visted[ch - 'a'] = true;
        }

        return sb.toString();

    }
}