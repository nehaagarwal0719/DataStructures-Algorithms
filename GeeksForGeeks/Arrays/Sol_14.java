import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int T=sc.nextInt();
		int j;
		for(int i=1;i<=T;i++){
		    
		    int n=sc.nextInt();
		    int a[]= new int[n];
		    for(j=0;j<n;j++){
		        a[j]=sc.nextInt();
		    }
		    int left=0;
		    int right=n-1;
		    while(left<=right){
		        if(a[left]>=a[right])
		          left++;
		        else
		          right--;
		    }
		    System.out.println(a[right]);
		}
		
	}
}