class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, zeroCount = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            
            // agar 0 mila toh count badhao
            if (nums[right] == 0) {
                zeroCount++;
            }

            // agar zeroCount > k ho gaya, window shrink karo
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // max length update
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}