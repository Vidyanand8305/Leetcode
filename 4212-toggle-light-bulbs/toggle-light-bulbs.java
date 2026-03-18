import java.util.*;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : bulbs) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < bulbs.size(); i++) {
            int bulb = bulbs.get(i);

            if (map.get(bulb) % 2 != 0) {
                list.add(bulb);
                map.put(bulb, 0);
            }
        }
        Collections.sort(list);
        return list;
    }
}