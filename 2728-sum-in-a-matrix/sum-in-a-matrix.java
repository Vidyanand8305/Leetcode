import java.util.*;

class Solution {
    public int matrixSum(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int sum = 0;

        // Sort each row
        for (int i = 0; i < m; i++) {
            Arrays.sort(nums[i]);
        }

        // Traverse column-wise
        for (int col = n - 1; col >= 0; col--) {
            int maxVal = 0;
            for (int row = 0; row < m; row++) {
                maxVal = Math.max(maxVal, nums[row][col]);
            }
            sum += maxVal;
        }

        return sum;
    }
}
