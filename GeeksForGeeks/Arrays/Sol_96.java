class GfG
{
   // Merges two subarrays of arr[].  First subarray is arr[l..m]
   // Second subarray is arr[m+1..r]
    void merge(int a[], int l, int m, int r)
    {
        int n1= m-l+1;
        int n2=r-m,i;
        
        int left[]=new int[n1];
        int right[]=new int[n2];
        
        for(i=0;i<n1;i++)
          left[i]=a[l+i];
        
        for(i=0;i<n2;i++)
          right[i]=a[i+m+1];
          
        i=0;int k=l,j=0;
        
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
             a[k]=left[i];
             i++;
            }
            else{
                a[k]=right[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) { 
            a[k] = left[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            a[k] = right[j]; 
            j++; 
            k++; 
        } 
    }
}

 /* This method is present in a class other than GfG class .
static void mergeSort(int arr[], int l, int r)
 {
    GfG g = new GfG();
    if (l < r)   
   {
        int m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr , m+1, r);
        g.merge(arr, l, m, r);
    }
}*/