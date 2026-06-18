class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0;
        int j = 0;

        while (i < n || j < n) {
            // Skip underscores in start
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            // Skip underscores in target
            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            // If one string is exhausted, both must be exhausted
            if (i == n || j == n) {
                return i == n && j == n;
            }

            // Check if the current pieces are different
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }

            // Check constraints for 'L' (can only move left)
            if (start.charAt(i) == 'L' && i < j) {
                return false;
            }
            // Check constraints for 'R' (can only move right)
            if (start.charAt(i) == 'R' && i > j) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}