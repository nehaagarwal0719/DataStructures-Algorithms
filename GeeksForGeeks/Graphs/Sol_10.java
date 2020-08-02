class Area {
    int count=0;
     int findMaxArea(int N, int M, int A[][]) {
        
         boolean[][] visited = new boolean[N][M]; 
  
        // Initialize result as 0 and traverse through the 
        // all cells of given matrix 
        int result = 0; 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < M; j++) { 
  
                // If a cell with value 1 is not 
                if (A[i][j] == 1 && !visited[i][j]) { 
  
                    // visited yet, then new region found 
                     count = 1; 
                    DFS(A, i, j, visited,N,M); 
  
                    // maximum region 
                    result = Math.max(result, count); 
                } 
            } 
        } 
        return result; 
    }
    
     boolean isSafe(int[][] A, int row, 
                          int col, boolean[][] visited,int N, int M) 
    { 
        // row number is in range, column number is in 
        // range and value is 1 and not yet visited 
        return ((row >= 0) && (row < N) && (col >= 0) 
                && (col < M) && (A[row][col] == 1 && !visited[row][col])); 
    } 
  
    // A utility function to do DFS for a 2D boolean 
    // matrix. It only considers the 8 neighbours as 
    // adjacent vertices 
     void DFS(int[][] A, int row, 
                    int col, boolean[][] visited,int N, int M) 
    { 
        // These arrays are used to get row and column 
        // numbers of 8 neighbours of a given cell 
        int[] rowNbr = { -1, -1, -1, 0, 0, 1, 1, 1 }; 
        int[] colNbr = { -1, 0, 1, -1, 1, -1, 0, 1 }; 
  
        // Mark this cell as visited 
        visited[row][col] = true; 
  
        // Recur for all connected neighbours 
        for (int k = 0; k < 8; k++) { 
            if (isSafe(A, row + rowNbr[k], col + colNbr[k], visited,N,M)) { 
                // increment region length by one 
                count++; 
                DFS(A, row + rowNbr[k], col + colNbr[k], visited,N,M); 
            } 
        } 
    } 
}