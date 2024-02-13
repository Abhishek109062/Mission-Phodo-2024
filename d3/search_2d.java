class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int e=matrix.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(matrix[mid][0]>target)
            {
                e=mid-1;
            }
            else if(matrix[mid][0]<target)
            {
                s=mid+1;
                ans=mid;
            }
            else
            {
                return true;
            }

            
        }
        if(ans!=-1)
        {
           s=0;
           e=matrix[0].length-1;
           while(s<=e)
           {
                int mid=s+(e-s)/2;
                if(matrix[ans][mid]>target)
                {
                    e=mid-1;
                }
                else if(matrix[ans][mid]<target)
                {
                    s=mid+1;
                }
                else
                {
                    return true;
                }
           }
        }
        return false;
    }
}
