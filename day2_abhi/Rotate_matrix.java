package day2_abhi;

class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int x = 0; x < len; x++){
            for(int y = 0; y < len; y++){
                if(x < y){
                    int temp = matrix[x][y];
                    matrix[x][y] =  matrix[y][x];
                    matrix[y][x] = temp;
                }
            }
        }
        
        
         for(int x = 0; x < len; x++){
            int y = 0;
             while(y < len/2){
                 int temp = matrix[x][y];
                    matrix[x][y] =  matrix[x][len -1 -y];
                    matrix[x][len -1 -y] = temp;
                y++;
}   
        }
        
        
    }
}
