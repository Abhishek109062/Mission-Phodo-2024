package day2_abhi;
import java.util.* ;
import java.io.*; 
class Solution {
    public static long getInversions(long arr[], int n) {
       return mergeSort(arr, 0, n-1);
    }




    public static long mergeSort(long arr[], int start, int end){
        if(start >= end)
        return 0;
            int mid = (start + end)/2;
            long ans = 0;
            ans += mergeSort(arr, start, mid);
            ans += mergeSort(arr, mid+1, end);
            ans += merge(arr, start, mid, end); 
            return ans;
            
    }

    public static long merge(long arr[], int start, int mid , int end){
        
        List<Long> temp = new ArrayList<>();


        int x = start;
        int y = mid+1;
       
        int ans = 0;
        while(x <= mid && y <= end)
        {
            if(arr[x] <= arr[y]){
                temp.add(arr[x]);
                x++;
            }else{
                ans += (mid - x + 1);
               temp.add(arr[y]);
                y++;
            }
        }


        while(x <= mid){
            temp.add(arr[x++]);
        }

        while(y <= end)
        temp.add(arr[y++]);

        int z = 0;
        for(int i = start; i <= end; i++){
            arr[i] = temp.get(z++);
        }
        

        return ans;
    }
}