import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            if(map.containsKey(num)){
                int oldf = map.get(num);
                map.put(num, oldf + 1);
            }else{
                map.put(num, 1);           }
        }
        for(int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}