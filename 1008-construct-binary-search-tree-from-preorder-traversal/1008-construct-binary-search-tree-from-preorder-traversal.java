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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++){
            root=build(root,preorder[i]);
        }
        return root;
    }
    static TreeNode build(TreeNode root,int ele){
        if(root == null){
            return new TreeNode(ele);
        }
        if(ele < root.val){
            root.left=build(root.left,ele);
        }
        else{
            root.right=build(root.right,ele);
        }
        return root;
    }
    
}