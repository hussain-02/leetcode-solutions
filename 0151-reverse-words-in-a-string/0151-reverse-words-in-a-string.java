class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");

        int l = 0;
        int r = words.length - 1;

        while(l < r){
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }

        StringBuilder result = new StringBuilder();

        for(String word : words){
            if(!word.isEmpty()){
                if(result.length() > 0){
                    result.append(" ");
                }
                result.append(word);
            }
        }


        return result.toString();


    }
}