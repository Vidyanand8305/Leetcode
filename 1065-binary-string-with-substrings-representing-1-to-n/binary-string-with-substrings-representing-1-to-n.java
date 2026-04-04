class Solution {
    public boolean queryString(String s, int n) {
        if(n>1000) return false;
        for(int i = n;i>n/2;i--){
            String a = Integer.toBinaryString(i);
            if(!s.contains(a)) 
            { return false;
        }      
    }
    return true;
     }
}