import java.util.*;

class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums); // ascending
        long sum = 0;
        int count = 0;

        // traverse from largest to smallest
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            if (sum > 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
