class Solution {
    public long minimumSteps(String s) {
        long totalSwaps = 0 ;

        int insertPos = 0;

        for(int current = 0 ; current  < s.length() ; current++ ){
            if(s.charAt(current) == '0' ){

                totalSwaps += current - insertPos;

                insertPos++;
            }
        }

        return totalSwaps;

    }
}