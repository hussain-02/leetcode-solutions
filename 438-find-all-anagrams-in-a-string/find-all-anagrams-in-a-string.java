class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        int[] PFreq = new int[26];

        for(int i = 0 ; i < k ; i++){
            PFreq[p.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i <= n - k ; i++){
            int[] SFreq = new int[26];
            for(int j = i ; j <= i + k -1; j++){

                SFreq[s.charAt(j) - 'a']++;
            }

            if(Arrays.equals(SFreq,PFreq)) list.add(i);
        }
        return list;
    }
}