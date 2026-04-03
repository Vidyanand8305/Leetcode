class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zero= 0;
        int length= 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            while(zero>1){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            length = Math.max(length,i-left);
        }
        return length;
    }
}