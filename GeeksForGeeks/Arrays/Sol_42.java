int findEquilibrium(int arr[], int n)
{
   int sum = 0;
   int leftsum = 0; 
  
   for (int i = 0; i < n; ++i) 
    sum += arr[i]; 
    
   for (int i = 0; i < n; ++i) { 
             leftsum += arr[i]; 
            
  
            if (leftsum == sum) 
                return i; 
  
           sum -= arr[i]; 
        } 
  
  return -1;
  
}