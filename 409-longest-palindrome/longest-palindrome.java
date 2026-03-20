class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int len = 0;
        boolean odd = false;

        for (int freq : map.values()) {
            len += (freq / 2) * 2;
            if (freq % 2 == 1) odd = true;
        }

        return odd ? len + 1 : len;
    }
}