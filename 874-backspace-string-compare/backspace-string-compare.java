class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String str) {
 Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '#') {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);          }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<st.size();i++){
            char ch =  st.get(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}