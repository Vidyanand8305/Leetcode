class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int num = 0;

        for (int bit : nums) {
            num = (num * 2 + bit) % 5;

            if (num == 0) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }
}