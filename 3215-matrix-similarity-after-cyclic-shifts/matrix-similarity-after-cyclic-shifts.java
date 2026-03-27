class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        k = k % m; // optimize shifts

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i % 2 == 0) {
                    // even row → left shift
                    if (mat[i][j] != mat[i][(j + k) % m]) {
                        return false;
                    }
                } else {
                    // odd row → right shift
                    if (mat[i][j] != mat[i][(j - k + m) % m]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}