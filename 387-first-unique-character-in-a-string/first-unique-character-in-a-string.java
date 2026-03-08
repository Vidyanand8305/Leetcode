class Solution {
    public int firstUniqChar(String s) {
       
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0 ;i<s.length();i++){
            char ch = s.charAt(i);
        if(map.containsKey(ch)){
            int oldf = map.get(ch);
            map.put(ch,oldf+1);
        }else{
            map.put(ch, 1);
        }
        }
        for(int i =0 ;i<s.length();i++){
            char c = s.charAt(i);
            if(map.get(c)==1){  
                return i;
            }
        }
return -1;
    }
}