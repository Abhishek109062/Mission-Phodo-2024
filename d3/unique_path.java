class Solution {
    static int dp[][];
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        for(int i[]:dp)
            Arrays.fill(i,-1);
        return count(m,n,0,0);
    }
    static int count(int m,int n,int i,int j){
        if(i>=m||j>=n||i<0||j<0)
            return 0;
        if(i==m-1&j==n-1)
            return 1;
        if(dp[i][j]!=-1)return dp[i][j];

        return dp[i][j]=count(m,n,i+1,j)+count(m,n,i,j+1);
        
    }

}
