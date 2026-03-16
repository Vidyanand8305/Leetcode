import java.util.*;

class Solution {
    public int secondHighest(String s) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                int num = ch - '0';

                if(map.containsKey(num)){
                    int old = map.get(num);
                    map.put(num, old + 1);
                }else{
                    map.put(num, 1);
                }
            }
        }
        int count = 0;
        for(int i = 9; i >= 0; i--){
        if(map.containsKey(i)){
                count++;
                if(count == 2){
                    return i;
                }
            }
        }
        return -1;
    }
}