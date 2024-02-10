class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=m;
        if(n==0)return;
        m=n=0;
       
        while(m<nums1.length&&n<nums2.length)
        {
            if(m>=x){
                nums1[m]=nums2[n++];
            }else if(nums1[m]>nums2[n])
            {
                int temp=nums1[m];
                nums1[m]=nums2[n];
                nums2[n]=temp;
                
                for(int i=n;i<nums2.length-1;i++)
                {
                    if(nums2[i]>nums2[i+1])
                    {
                        int temp1=nums2[i];
                        nums2[i]=nums2[i+1];
                        nums2[i+1]=temp1;
                    }
                    else
                    {
                        break;
                    }
                }
              
            }
            
            m++;
        }
    }
}
