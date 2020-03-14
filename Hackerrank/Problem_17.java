 #ONLY THE MAIN LOGIC
 
 public static void postOrder(Node root) {
       
        if(root.left!=null){   
           postOrder(root.left);
        }  
         System.out.print(root.data + " ");
         
         if(root.right!=null){
           postOrder(root.right);
        }

    


    }
