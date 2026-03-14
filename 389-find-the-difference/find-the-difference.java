class Solution {
    public char findTheDifference(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i =0 ;i<s.length();i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            int oldf = map.get(ch);
            map.put(ch, oldf+1);
        }
        else{
            map.put(ch,1);
        }
    }
    for(int i=0;i<t.length();i++){
        char ch = t.charAt(i);
        if(map.containsKey(ch) == false){
            return ch;

        }
        else{
            int oldf = map.get(ch);
            map.put(ch,oldf-1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
      
    }
    return ' ';
        
    }
}