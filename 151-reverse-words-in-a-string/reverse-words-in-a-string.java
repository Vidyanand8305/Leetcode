class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            StringBuilder word = new StringBuilder();
            while (i >= 0 && s.charAt(i) != ' ') {
                word.append(s.charAt(i)); 
                i--;    }
            if (result.length() > 0) {
                result.append(' ');      }
            for (int j = word.length() - 1; j >= 0; j--) {
                result.append(word.charAt(j));
            }
        }
        return result.toString();
    }
}
