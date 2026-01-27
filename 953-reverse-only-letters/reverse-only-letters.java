class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            
            // move left until letter found
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }
            
            // move right until letter found
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }
            
            // swap letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(arr);
    }
}
