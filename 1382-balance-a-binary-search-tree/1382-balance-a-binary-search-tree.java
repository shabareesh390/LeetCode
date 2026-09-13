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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return build(list, 0, list.size() - 1);
    }

    static void inorder(TreeNode root, ArrayList<Integer> list) {
        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    static TreeNode build(ArrayList<Integer> list, int start, int end) {
        if(start > end){
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = build(list, start, mid - 1);
        root.right = build(list, mid + 1, end);

        return root;
    }
}