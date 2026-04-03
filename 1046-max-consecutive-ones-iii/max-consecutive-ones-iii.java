class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, zerocount = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
     if (nums[right] == 0) {
                zerocount++;
            }
            while (zerocount > k) {
                if (nums[left] == 0) {
                    zerocount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}