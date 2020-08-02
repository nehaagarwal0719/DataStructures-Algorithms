class Solution {

public int PthAncestor(Node root, int x, int y, int p,ArrayList<Integer> list){

    Node node = lca(root,x,y,list);
    if(node == null)return -1;
    
    return (list.size()>=p)? list.get(list.size()-p) : -1;
}

public Node lca(Node root,int x,int y,ArrayList<Integer> list){
    
    if(root == null)return null;
    
    list.add(root.data);
    if(root.data > x && root.data > y){
    return lca(root.left,x,y,list);
    }
    
    if(root.data < x && root.data < y){
    return lca(root.right,x,y,list);
    }
    
    return root;
}