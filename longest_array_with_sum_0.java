class GfG
{
    int maxLen(int arr[], int n)
    {
        int sum =0;
        int ans=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(hm.containsKey(sum))
            {
                ans=Math.max(ans,i-hm.get(sum));
            }
            if(!hm.containsKey(sum))
                hm.put(sum,i);
            
            
        }
        return ans;
    }
}
