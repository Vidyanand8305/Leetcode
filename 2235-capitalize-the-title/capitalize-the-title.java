class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i].toLowerCase(); // pehle sab lowercase

            if (w.length() <= 2) {
                result.append(w);
            } else {
                result.append(Character.toUpperCase(w.charAt(0)));
                result.append(w.substring(1));
            }

            if (i != words.length - 1) result.append(" ");
        }

        return result.toString();
    }
}
