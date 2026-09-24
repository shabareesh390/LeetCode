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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);
        return level(root,xx,0)==level(root,yy,0) && !isSib(root,xx,yy);

    }
    static TreeNode findNode(TreeNode root,int x){
        if(root == null){
            return null;
        }
        if(root.val == x){
            return root;
        }
        TreeNode l=findNode(root.left,x);
        if(l != null){
            return l;
        }
        return findNode(root.right,x);
    }
    static boolean isSib(TreeNode root,TreeNode x,TreeNode y){
        if(root == null){
            return false;
        }
        return ((root.left==x && root.right==y) || (root.left==y && root.right==x) || (isSib(root.left,x,y)) || (isSib(root.right,x,y)));
    }
    static int level(TreeNode root,TreeNode x,int lev){
        if(root == null){
            return 0;
        }
        if(root == x){
            return lev; 
        }
        int l=level(root.left,x,lev+1);
        if(l != 0){
            return l;
        }
        return level(root.right,x,lev+1);
    }
}