package day2_abhi;
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> temp = new ArrayList<>();
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
                    
            }
        });
        
        int len = intervals.length;
        
        for(int[] ar : intervals){
            
            if(temp.isEmpty() || temp.get(temp.size() - 1).get(1) < ar[0]){
                temp.add(Arrays.asList(ar[0], ar[1]));
            }else{
                temp.get(temp.size() - 1).set(1, Math.max(temp.get(temp.size() - 1).get(1), ar[1]));
            }
        }
        
        int[][] ans = new int[temp.size()][2];
        
        int x = 0;
        for(List<Integer> tr : temp){
            ans[x][0] = tr.get(0);
            ans[x++][1] = tr.get(1);
        }
        
        return ans;
    }
}