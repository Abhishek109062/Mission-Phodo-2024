class Solution {
    public int[][] merge(int[][] intervals) {
        int lastendtime=-1;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<Integer> ls = new LinkedList<>();
        ls.add(intervals[0][0]);
        int endtime=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(endtime<intervals[i][0])
            {
                ls.add(endtime);
                ls.add(intervals[i][0]);
                endtime=intervals[i][1];
            }
            else{
                endtime=Math.max(endtime,intervals[i][1]);
            }
        }
        ls.add(endtime);
        int arr[][]=new int[ls.size()/2][2];
        for(int i=0;i<arr.length;i++)
        {
            arr[i][0]=ls.remove(0);
            arr[i][1]=ls.remove(0);
        }
        return arr;
    }
}
