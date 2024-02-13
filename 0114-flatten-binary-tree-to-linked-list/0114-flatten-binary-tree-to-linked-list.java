/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Stack<TreeNode> stack = new Stack<>();
    public void flatten(TreeNode root) {
        if(root == null) return;
        
        TreeNode curr = root;
        
        if(root.right != null)
            helper(root.right);
        
        if(root.left != null)
            helper(root.left);
        
        
        while(!stack.isEmpty()){
            curr.right = stack.pop();
            curr.left = null;
            curr = curr.right;
        }
    }
    
    private void helper(TreeNode root){
        if(root == null) return;
        helper(root.right);
        helper(root.left);
        stack.push(root);
    }
}