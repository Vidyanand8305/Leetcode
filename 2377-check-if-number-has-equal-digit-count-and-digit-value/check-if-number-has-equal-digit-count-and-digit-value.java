class Solution {
    public boolean digitCount(String num) {

        int[] count = new int[10]; // to count digits 0–9

        // Step 1: count frequency of each digit in num
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            count[digit]++;
        }

        // Step 2: check condition for each index
        for (int i = 0; i < num.length(); i++) {
            int expected = num.charAt(i) - '0';
            if (count[i] != expected) {
                return false;
            }
        }

        return true;
    }
}
