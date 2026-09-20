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
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length);
    }
    static TreeNode build(int[] arr,int s,int e){
        if(s>=e){
            return null;
        }
        int mid=s+(e-s)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=build(arr,s,mid);
        root.right=build(arr,mid+1,e);
        return root;       
    }
   
    
}