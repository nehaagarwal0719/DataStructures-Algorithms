//https://www.youtube.com/watch?v=YsLko6sSKh8&pbjreload=101

class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node root)
	{
    // declare two stacks 
    Stack<Node> currentLevel = new Stack<>(); 
    Stack<Node> nextLevel = new Stack<>(); 
    
    ArrayList<Integer> al = new ArrayList<>();
    
    if (root == null) { 
    return al; 
    } 
    
    currentLevel.push(root); 
    boolean leftToRight = true; 
    
     while (!currentLevel.isEmpty()) {                                   
  
    // pop out of stack 
    Node node = currentLevel.pop(); 
      
    // print the data in it 
    al.add(node.data);
  
    // store data according to current 
    // order. 
    if (leftToRight) { 
        if (node.left!= null) { 
        nextLevel.push(node.left); 
        } 
          
        if (node.right != null) { 
        nextLevel.push(node.right); 
        } 
    } 
    else { 
        if (node.right != null) { 
        nextLevel.push(node.right); 
        } 
          
        if (node.left != null) { 
        nextLevel.push(node.left); 
        } 
    } 
  
    if (currentLevel.isEmpty()) { 
        leftToRight = !leftToRight; 
        Stack<Node> temp = currentLevel; 
        currentLevel = nextLevel; 
        nextLevel = temp; 
    } 
    } 
    return al;
} 
}