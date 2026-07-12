class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int r = mat.length;
        int c = mat[0].length;
        int i = 0 , j =0;
        int l = r - 1;

        while(i < r){
            sum += mat[i][j];
            sum += mat[i][l];

            i++;
            j++;
            l--;
        }

        if(r == 1) return mat[0][0];

        if(r %2 != 0 ) sum -= mat[r/2][r/2];
        return sum;
    }
}