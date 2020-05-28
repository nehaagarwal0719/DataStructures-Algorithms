class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        int max=0,res=0,c=0;
        // Your code here
        for(int j=0;j<n;j++){
            c=0;
            for(int i=0;i<n;i++){
                if(a[i][j]==0)
                 c++;
            }
            if(c>max){
             max=c;
             res=j;
            } 
        }
        return res;
    }
}