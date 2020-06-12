class Solution {
    public int longestPalindromeSubseq(String s) {
        char s1[]=s.toCharArray();  
        int m=s1.length;
	    char s2[]= new char[m];
        for(int k=m-1;k>=0;k--)
            s2[m-k-1]=s1[k];
             
         int n=s2.length;
		 int t[][]=new int[m+1][n+1],i,j;
		 
		 for(i=0;i<=m;i++){
		     for(j=0;j<=n;j++){
		         if(i==0|| j==0)
		          t[i][j]=0;
		     }
		 }
		 
		 for(i=1;i<=m;i++){
		     for(j=1;j<=n;j++){
		        if(s1[i-1]==s2[j-1])
		           t[i][j]=1+ t[i-1][j-1];
		         else
		          t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
		     }
		 }
		     return t[m][n];
    }
}