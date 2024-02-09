package Day1_abhi;
class Solution {
    public void setZeroes(int[][] matrix) {
        int flag = 1;
        
        
        for(int x = 0; x < matrix.length; x++){
                if(matrix[x][0] == 0)
                    flag = 0;
            for(int y = 1; y < matrix[0].length; y++){
        
                if(matrix[x][y] == 0){
                    matrix[x][0] = 0;
                    matrix[0][y] = 0;
                }
            }
        }
        
        
        for(int x = matrix.length - 1; x >= 0; x--){
            for(int y = matrix[0].length -1 ; y > 0; y--){
                if(matrix[x][0]  == 0 || matrix[0][y] == 0)
                    matrix[x][y] = 0;
            }
            
            if(flag == 0)
                matrix[x][0] = 0;
        }
    }
}