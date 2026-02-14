class Solution {
    public boolean isValid(String word) {

        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {

            if (Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }

            } else if (Character.isDigit(ch)) {
                continue; 
            } else {
                return false;
            }
        }

        return hasVowel && hasConsonant;
    }
}
