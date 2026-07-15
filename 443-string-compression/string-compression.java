class Solution {
    public int compress(char[] chars) {
        int i = 0 ;
         int res = 0;

         while(i < chars.length){
            int groupLength = 0;

            while(i + groupLength < chars.length && chars[i] == chars[i + groupLength]){
                groupLength++;
            }

            chars[res++] = chars[i];

            if(groupLength > 1){
                for(char k  : Integer.toString(groupLength).toCharArray()){
                    chars[res++] = k;
                }
            }

            i = i + groupLength;
         }

         return res;
    }
}