class Solution {
    public void nextPermutation(int[] nums)
    {
        int pos=-1;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                pos=i-1;
                break;
            }
        }
        if(pos==-1){
             reversed(nums,0);
             return;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[pos])
            {
                int temp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;
                reversed(nums,pos+1);
                break;
            }
        }
       
    }
    public void reversed(int arr[],int k)
    {
        int btw=(arr.length-k+1)/2;
        for(int i=0;i<btw;i++)
        {
            int temp=arr[k+i];
            arr[k+i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
}
