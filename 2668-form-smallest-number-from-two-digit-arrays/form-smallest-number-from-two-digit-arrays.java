class Solution {
    public int minNumber(int[] nums1, int[] nums2) {

        // Mark digits present in nums1
        boolean[] present = new boolean[10];
        for (int n : nums1) {
            present[n] = true;
        }

        // Check for smallest common digit
        int common = 10;
        for (int n : nums2) {
            if (present[n]) {
                common = Math.min(common, n);
            }
        }

        // If common digit found, return it
        if (common != 10) {
            return common;
        }

        // Otherwise find smallest digits from both arrays
        int min1 = 10, min2 = 10;

        for (int n : nums1) min1 = Math.min(min1, n);
        for (int n : nums2) min2 = Math.min(min2, n);

        // Form smallest two-digit number
        return Math.min(min1 * 10 + min2, min2 * 10 + min1);
    }
}
