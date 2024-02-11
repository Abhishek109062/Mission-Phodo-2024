package day3_abhi;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;

        int matlen = matrix[0].length -1;

        for(int x = 0; x < matrix.length; x++){
            if(matrix[x][matlen] >= target){
                row = x;
                break;
            }
        }   

// System.out.println(row);
        if(row == -1)
        return false;
        
        int i = 0;
        while(i <= matlen){
            int mid = (i + matlen)/2;

            if(target == matrix[row][mid])
            return true;

            if(target < matrix[row][mid])
            matlen = mid - 1;
            else
            i = mid+1;    
        }
        return false;

    }
}