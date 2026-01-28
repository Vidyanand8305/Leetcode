class Solution {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        String[] res = new String[a.length];
        for(String word : a){
            int n = word.length();
            int pos = word.charAt(n-1) -'0';
            res[pos-1] = word.substring(0,n-1);

        }
        return String.join(" ", res);
         
    }
}