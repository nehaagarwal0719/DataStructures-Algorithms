class GFG
{
    static Node construct(int arr[][],int n)
    {
        return construct1(arr, 0, 0,n);
        
    }
    
    static Node construct1(int arr[][], int i, int j,  
                                     int n) { 
          
        // return if i or j is out of bounds 
        if (i > n - 1 || j > n - 1) 
            return null; 
  
        Node temp = new Node(arr[i][j]); 
        temp.right = construct1(arr, i, j + 1, n); 
        temp.down = construct1(arr, i + 1, j, n); 
        return temp; 
    } 
}