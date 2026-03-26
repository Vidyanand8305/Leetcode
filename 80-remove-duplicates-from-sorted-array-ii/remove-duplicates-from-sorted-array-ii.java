class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 2; // first 2 elements always allowed

        for (int j = 2; j < nums.length; j++) {

            // check karo 3rd duplicate hai ya nahi
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}