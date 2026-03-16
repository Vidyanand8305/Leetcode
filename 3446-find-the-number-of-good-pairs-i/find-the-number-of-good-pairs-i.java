import java.util.*;

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                int old = map.get(nums2[i]);
                map.put(nums2[i], old + 1);
            }else{
                map.put(nums2[i], 1);
            }
        }
        int count = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int key : map.keySet()){
                int val = key * k;

                if(nums1[i] % val == 0){
                    count = count + map.get(key);
                }
            }
        }

        return count;
    }
}