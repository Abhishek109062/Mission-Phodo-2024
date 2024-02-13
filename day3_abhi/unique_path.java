package day3_abhi;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] temp = new int[m][n];
        return count(0, 0, m,n, temp);
    }

    public int count(int row, int col, int m, int n, int[][] mem){
        if(row < 0 || col < 0 || row >= m || col >= n){
            return 0;
        }

        if(row == m-1 && col == n-1)
        return 1;

        if(mem[row][col] != 0)
        return mem[row][col];

        // int sum = 0;
        mem[row][col]= count(row+1, col, m,n, mem) + count(row, col+1, m,n,mem);
        return mem[row][col];
        // return sum;
        
    }
}