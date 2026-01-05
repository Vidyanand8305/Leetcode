class Solution {
    public int firstUniqChar(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
        char ch = sb.charAt(i);
        if(sb.indexOf(String.valueOf(ch)) == sb.lastIndexOf(String.valueOf(ch))){
            return i;
        }


        }
        return -1;
        
    }
}