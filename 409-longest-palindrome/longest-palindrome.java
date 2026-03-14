class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                int oldf = map.get(ch);
                map.put(ch, oldf + 1);
            }else{
                map.put(ch, 1);
            }
        }
        int len = 0;
        boolean oddFound = false;
        for(char key : map.keySet()){
            int freq = map.get(key);
            if(freq % 2 == 0){
                len = len + freq;
            }else{
                len = len + (freq - 1);
                oddFound = true;
            }
        }

        if(oddFound == true){
            len = len + 1;
        }
        return len;
    }
}