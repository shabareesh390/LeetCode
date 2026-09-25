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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> level=new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<TreeNode> q=new LinkedList<>();
        q.addLast(root);
        q.addLast(null);
        boolean rev=false;
        while(!q.isEmpty()){
            TreeNode curr;
            if(!rev){
                curr=q.removeFirst();
            }
            else{
                curr=q.removeLast();
            }
            if(curr == null){
                result.add(level);
                level=new ArrayList<>();
                if(q.isEmpty()){
                    return result;
                }
                rev=!rev;
                if(rev){
                    q.addFirst(null);
                }
                else{
                    q.addLast(null);
                }
            }
            else{
                level.add(curr.val);
                if(!rev){
                    if(curr.left != null){
                        q.addLast(curr.left);
                    }
                    if(curr.right != null){
                        q.addLast(curr.right);
                    }
                }
                else{
                    if(curr.right != null){
                        q.addFirst(curr.right);
                    }
                     if(curr.left != null){
                        q.addFirst(curr.left);
                    } 
                }
            }
        }
        return result;
    }
}