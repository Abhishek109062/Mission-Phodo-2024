class Solution {
    public void setZeroes(int[][] arr) {
        // Problem 
        // find zero and transform its row and column to zero
        
        //❌ but putting row and column to zero will introduce more zeroes  
        //❌ putting -1 instead of zero in row and column and changing it later
        //to zero will also not work as range of values covers entire range of
        // integer
        //✔️ storing row and columns positions of all zeres and then modifying 
        // those rows and columns to zero  --  space(m+n)
        //✅ instead of storing row and column in different list we can store 
        //them in the matrices itself
        int check0=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]==0)check0=1;
            for(int j=1;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i][0]==0)
            {
                for(int j=0;j<arr[0].length;j++){
                    arr[i][j]=0;
                }
            }
        }
        for(int j=1;j<arr[0].length;j++)
        {
            if(arr[0][j]==0)
            {
                for(int i=0;i<arr.length;i++)
                {
                    arr[i][j]=0;
                }
            }
        }
        if(arr[0][0]==0)
        {
            for(int i=0;i<arr[0].length;i++)
            {
                arr[0][i]=0;
            }
        }
        if(check0==1){
            for(int i=0;i<arr.length;i++)
            {
                arr[i][0]=0;
            }
        }
        
    }
}
