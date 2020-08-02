class Tree {
    /*you are required to complete this function */
    boolean hasPathSum(Node node, int sum) {
        // Your code here
        
        if (node == null) 
            return sum == 0; 
        return hasPathSum(node.left, sum - node.data) ||  
               hasPathSum(node.right, sum - node.data); 
               
    }
}