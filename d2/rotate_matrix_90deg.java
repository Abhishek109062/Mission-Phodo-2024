class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length-1;
        for(int j=0;j<(n+1)/2;j++)
        for(int i=0;i<(arr[0].length+1)/2;i++)
        {
            int temp=arr[j][i];
            arr[j][i]=arr[n-i][j];
            arr[n-i][j]=arr[n-j][n-i];
            arr[n-j][n-i]=arr[i][n-j];
            arr[i][n-j]=temp;
        }
    }
}
