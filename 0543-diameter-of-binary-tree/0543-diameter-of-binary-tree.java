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
    public int diameterOfBinaryTree(TreeNode root) {
        return diam(root).dia;
    }
    static class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int ht,int dia){
            this.ht=ht;
            this.dia=dia;
        }
    }
    static TreeInfo diam(TreeNode root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diam(root.left);
        TreeInfo right=diam(root.right);

        int myHeight=Math.max(left.ht,right.ht)+1;

        int dia1=left.dia;
        int dia2=right.dia;
        int dia3=left.ht+right.ht;

        int myDia=Math.max(Math.max(dia1,dia2),dia3);
        return new TreeInfo(myHeight,myDia);
    }
}