class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int [] arr =  new int[n*n];
        int idx = 0;
         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
              int num = matrix[i][j]; 
       arr[idx] = num; 
      idx = idx + 1;         

            }
        }
        
        Arrays.sort(arr);
        return arr[k - 1]; 
        
    }
}