class Solution {
    public List<List<Integer>> generate(int numRows) {
        int arr[]=new int [numRows+1];
        arr[0]=1;
        List<List<Integer>> parent = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> child= new ArrayList<>();
            for(int j=i;j>0;j--)
            {
                arr[j]=arr[j]+arr[j-1];
                child.add(0,arr[j]);
            }
            child.add(0,1);
            parent.add(child);
        }
        return parent;
    }
}

//todo

//dp way for ncr 


//normal way for ncr
