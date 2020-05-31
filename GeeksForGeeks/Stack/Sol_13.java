class Celebrity
{
    
    int getId(int M[][], int n)
    {
        Stack<Integer> st= new Stack<>();
        
        for(int i=0;i<n;i++)
            st.push(i);
            
        while(st.size()>1){
            int a= st.pop();
            int b=st.pop();
            
            if(M[a][b]==1)
              st.push(b);
            else
              st.push(a);
              
        }    
        
        int c=st.pop();
        
        for(int i=0;i<n;i++){
            if( i!=c && (M[c][i]==1 || M[i][c]==0))
             return -1;
        }
        
        
        return c;
    }
}

----------------------------------------------------------------------

int getId(int M[][], int n)
    {
        
        int left=0,right=n-1;
        
        while(left<right){
            if(M[left][right]==1)
              left++;
            else
              right--;
        }
            
     
        
        for(int i=0;i<n;i++){
            if( i!=left && (M[left][i]==1 || M[i][left]==0))
             return -1;
        }
        
        
        return left;
    }

    https://www.youtube.com/watch?v=bSV4gyq2zyM