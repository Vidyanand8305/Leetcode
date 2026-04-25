import java.util.*;

class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                if(!st.isEmpty()) {
                    st.pop(); 
                }
            } else {
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}