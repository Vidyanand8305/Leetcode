import java.util.*;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], 1);
        }

        int min = Integer.MAX_VALUE;
        for(int j = 0; j < nums2.length; j++){

            if(map.containsKey(nums2[j])){
                if(nums2[j] < min){
                    min = nums2[j];
                }
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }

        return min;
    }
}