class Union
{
    
    static void findUnion(int arr1[], int arr2[], int n, int m)
    {
    
    StringBuilder sb = new StringBuilder();
    int i =0, j = 0;
	while(i<n && j<m){
		if(arr1[i]==arr2[j]){
		    if (i == 0 || arr1[i] != arr1[i - 1])
			    sb.append(arr1[i]+" ");
			i++; j++;
		}
		else if(arr1[i]<arr2[j]){
			if(i==0 || arr1[i]!=arr1[i-1])
				sb.append(arr1[i]+" ");
			i++;
		}
		else{
			if(j==0 || arr2[j]!=arr2[j-1])
				sb.append(arr2[j]+" ");
			j++;
		}
	}
	while(i<n){
		if(i==0 || arr1[i]!=arr1[i-1])
			sb.append(arr1[i]+" ");
		i++;
	}
	while(j<m){
		if(j==0 || arr2[j]!=arr2[j-1])
			sb.append(arr2[j]+" ");
		j++;
	}
	System.out.print(sb);
    }
}