class GFG
{
    static void rotate(int a[][]) 
    {
         int i,j;
         int n=a.length;
         
         for(i=0;i<n;i++){
		     for(j=i;j<n;j++){
		         int temp=a[i][j];
		         a[i][j]=a[j][i];
		         a[j][i]=temp;
		     }
		  }
		  
		   for(i=0;i<n/2;i++){
		     for(j=0;j<n;j++){
		         int temp=a[i][j];
		         a[i][j]=a[n-1-i][j];
		         a[n-1-i][j]=temp;
		     }
		  }
    }
}