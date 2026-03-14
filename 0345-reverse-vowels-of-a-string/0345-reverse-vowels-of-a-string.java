class Solution {
    public String reverseVowels(String ss) {
        char[] words = ss.toCharArray();

        int s = 0;
        int e = ss.length() - 1;

        String vowels ="aeiouAEIOU";

        while(s < e){
            while(s < e && vowels.indexOf(words[s]) == -1) s++;
            while(s < e && vowels.indexOf(words[e]) == -1) e--;

            char temp  = words[s];
            words[s] = words[e];
            words[e] = temp;

            s++;
            e--;
        }


        return new String(words);
    }
}