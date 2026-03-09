import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                int old = map.get(num);
                map.put(num, old + 1);
            }else{
                map.put(num, 1);
            }
        }
        int max = -1;
        for(int key : map.keySet()){
            if(key == map.get(key)){
                if(key > max){
                    max = key;
                }
            }
        }

        return max;
    }
}