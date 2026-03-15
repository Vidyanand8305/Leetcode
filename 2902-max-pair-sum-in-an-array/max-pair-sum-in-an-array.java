import java.util.*;

class Solution {

    public int maxSum(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for(int i = 0; i < nums.length; i++){

            int digit = maxDigit(nums[i]);

            if(map.containsKey(digit)){

                int sum = nums[i] + map.get(digit);

                if(sum > maxSum){
                    maxSum = sum;
                }

                if(nums[i] > map.get(digit)){
                    map.put(digit, nums[i]);
                }

            }else{
                map.put(digit, nums[i]);
            }
        }

        return maxSum;
    }

    public int maxDigit(int num){

        int max = 0;

        while(num > 0){

            int d = num % 10;

            if(d > max){
                max = d;
            }

            num = num / 10;
        }

        return max;
    }
}