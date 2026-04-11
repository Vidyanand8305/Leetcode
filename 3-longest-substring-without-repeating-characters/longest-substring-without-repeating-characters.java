class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxlen = 0;
        for(int right  = 0; right<s.length();right++){
            char ch =  s.charAt(right);
            if(map.containsKey(ch)){
               left = Math.max(left, map.get(ch) + 1);
            }
                map.put(ch,right);
                int len = right-left+1;
                if(len>maxlen){
                    maxlen= len;
                }          
        }
        return maxlen;       
    }
}