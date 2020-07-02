static void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        
        int pi = new QuickSort().partition(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    } }*/
class QuickSort
{
    /* This function takes last element as pivot, places  the pivot element 
    at its correct position in sorted  array, and places all smaller (smaller
    than pivot) to left of pivot and all greater elements to right  of pivot */
    static int partition(int a[], int low, int high)
    {
        int pivot=a[high];
        int pindex=low;
        for(int i=low;i<high;i++){
            if(a[i]<=pivot){
                int temp=a[i];
                a[i]=a[pindex];
                a[pindex]=temp;
                pindex++;
            }
        }
        int temp=a[pindex];
        a[pindex]=a[high];
        a[high]=temp;
        
        return pindex;
    } 
}