import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if(op.equals("C")) {
                s.pop();
            } 
            else if(op.equals("D")) {
                s.push(2 * s.peek());
            } 
            else if(op.equals("+")) {
                int last = s.pop();
                int secondLast = s.peek();
                s.push(last); 
                s.push(last + secondLast);
            } 
            else {
                int num = Integer.parseInt(op);
                s.push(num);
            }
        }
        int sum = 0;
        for(int i = 0; i < s.size(); i++) {
            sum += s.get(i);
        }

        return sum;
    }
}