class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n  =  nums.length;
        for(int i= 0;i<n;i++){
            if(map.containsKey(nums[i])){
                int oldf = map.get(nums[i]);
                map.put(nums[i], oldf+1);
            }
            else{
                 map.put(nums[i],1);
        
            }
            if(map.get(nums[i])>n/2) {
                return nums[i];
            }
        }
return -1;
       
    }
}