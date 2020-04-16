
class GFG {
    public Node getNode(int data) 
     { 

        Node newNode = new Node(data); 
        newNode.left = newNode.right = null;  
        return newNode; 
     } 
     
    public Node constructBST(int[] arr){
        //Write your code here and return the root of the constructed BST
        
        if(arr.length==0) return null;
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=LevelOrder(root,arr[i]);
        }
        return root;
    }
    public Node LevelOrder(Node root, int data){
        if(root==null){
         root=getNode(data);
         return root;
        }
        
        if(data<=root.data)
          root.left=LevelOrder(root.left,data);
        else
          root.right=LevelOrder(root.right,data);
         return root;
    }
}