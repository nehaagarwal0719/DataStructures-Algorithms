class Islands {

    int findIslands(ArrayList<ArrayList<Integer>> A, int N, int M) {
            boolean visited[][]=new boolean[N][M];
            if(M==0) return 0;
            int count=0;
            
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(A.get(i).get(j)==1 && !visited[i][j]){
                      DFS(A,i,j,visited,M,N);
                      count++;
                    }
                }
            }
            
            return count;
               
    }
    
    void DFS(ArrayList<ArrayList<Integer>> A, int row, int col, boolean visited[][],int M, int N) 
    { 
        // These arrays are used to get row and column numbers 
        // of 8 neighbors of a given cell 
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 }; 
  
        // Mark this cell as visited 
        visited[row][col] = true; 
  
        // Recur for all connected neighbours 
        for (int k = 0; k < 8; ++k) 
            if (isSafe(A, row + rowNbr[k], col + colNbr[k], visited,M,N)) 
                DFS(A, row + rowNbr[k], col + colNbr[k], visited,M,N); 
    } 
    
    boolean isSafe(ArrayList<ArrayList<Integer>> A, int row, int col, 
                   boolean visited[][],int M, int N) 
    { 
        // row number is in range, column number is in range 
        // and value is 1 and not yet visited 
        return (row >= 0) && (row < N) && (col >= 0) && (col < M) && (A.get(row).get(col) == 1 && !visited[row][col]); 
    } 
}
