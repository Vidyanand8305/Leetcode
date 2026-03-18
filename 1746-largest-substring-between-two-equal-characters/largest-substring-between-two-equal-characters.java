import java.util.*;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int longest = -1;

 for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch) == null) {
       map.put(ch, i);
            } else {
                int len = i - map.get(ch) - 1;
            longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}