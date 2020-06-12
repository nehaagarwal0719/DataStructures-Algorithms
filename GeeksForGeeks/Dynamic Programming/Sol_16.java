class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
         char s1[]=str1.toCharArray();  
	     char s2[]= str2.toCharArray();
             
         int m=s1.length;
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
        
        i=m;j=n;String res="";
        while(i>0 && j>0){
            if(s1[i-1]==s2[j-1]){
                res=s1[i-1]+res;
                i--;j--;
            } 
            else{
                if(t[i-1][j]>t[i][j-1]){
                   res=s1[i-1]+res;
                   i--;
                 }
               else
               {
                   res=s2[j-1]+res;
                   j--;
               }
            }
        }
        while(i>0){
            res=s1[i-1]+res;
            i--;
        } 
        while(j>0){
            res=s2[j-1]+res;
            j--;
        } 
            
          return res;         
    }
}