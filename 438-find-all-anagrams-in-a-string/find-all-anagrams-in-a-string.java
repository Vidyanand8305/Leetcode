import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int k = p.length();
        List<Integer> ans = new ArrayList<>();
        if (k > s.length()) return ans;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0) + 1);
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (map1.equals(map2)) ans.add(0);

        int j = 0;
        for (int i = k; i < s.length(); i++) {
            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(s.charAt(j), map2.get(s.charAt(j)) - 1);
            if (map2.get(s.charAt(j)) == 0) {
                map2.remove(s.charAt(j));
            }

            j++; 
            if (map1.equals(map2)) {
                ans.add(j);
            }
        }

        return ans;
    }
}