/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       ArrayList<Integer> l = new ArrayList<Integer>();
        
        if(root!=null){
           l.addAll(postorderTraversal(root.left));
           l.addAll(postorderTraversal(root.right));
           l.add(root.val);
        }
        
        return l;
        
    }
}
