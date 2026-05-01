class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                StringBuilder temp = new StringBuilder();
                while (st.peek() != '(') {
                    temp.append(st.pop());
                }
      st.pop();
                for (int j = 0; j < temp.length(); j++) {
                    st.push(temp.charAt(j));
                }
            } else {
                st.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < st.size(); i++) {
            res.append(st.get(i));    }
        return res.toString();
    }
}