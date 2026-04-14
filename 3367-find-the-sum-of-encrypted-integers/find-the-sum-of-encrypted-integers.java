class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int max = 0, temp = num;
            while (temp > 0) {
                max = Math.max(max, temp % 10);
                temp /= 10;
            }
            int encrypted = 0;
            for (int t = num; t > 0; t /= 10) {
                encrypted = encrypted * 10 + max;
            }
            sum += encrypted;
        }
        return sum;
    }
}