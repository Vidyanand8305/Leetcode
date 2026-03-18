import java.util.*;

class Solution {
    public int countCompleteDayPairs(int[] hours) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < hours.length; i++) {
            int curr = hours[i] % 24;
            int need = (24 - curr) % 24;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        return count;
    }
}