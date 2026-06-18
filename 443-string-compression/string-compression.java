class Solution {
    public int compress(char[] ch) {
      int i = 0 ;
      int res = 0;


      while(i < ch.length){
        int groupLength = 0;

        while(i + groupLength < ch.length && ch[i] == ch[i + groupLength]){
            groupLength++;
        }

        ch[res++] = ch[i];

        if(groupLength > 1){
            for(char c : Integer.toString(groupLength).toCharArray()){
                ch[res++] = c;
            }
        }
            i = i + groupLength;

      }

      return res;
    
    }
}