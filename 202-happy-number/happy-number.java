class Solution {
    public boolean isHappy(int n) {
        for (int i = 0; i < 100; i++) {   
            if (n == 1) return true;
            n = getNext(n);
        }

        return false; 
    }
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
