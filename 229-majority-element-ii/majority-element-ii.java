import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                int oldf = map.get(num);
                map.put(num, oldf + 1);
            }else{
                map.put(num, 1);
            }
        }
        int n = nums.length;
        // convert keys to list
        List<Integer> keys = new ArrayList<>(map.keySet());
        for(int i = 0; i < keys.size(); i++){
            int key = keys.get(i);
            if(map.get(key) > n/3){
                ans.add(key);
            }
        }

        return ans;
    }
}