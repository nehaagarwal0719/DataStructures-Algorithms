class GfG
{
    public static void countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       
       //Arrays.sort(arr1);
       Arrays.sort(arr2);
       
       int i=0,j=0;
       while(i<arr1.length){
            int pos=search(arr2,n,arr1[i]);
            System.out.print((pos+1) + " ");
            i++;
       }
       
       
    }
    
    public static int search(int a[],int n,int val){
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            
            if(a[mid]<=val)
              l=mid+1;
            else
             r=mid-1;
        }
        return r;
    }
}