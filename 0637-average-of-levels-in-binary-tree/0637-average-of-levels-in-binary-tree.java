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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        List<Integer> level=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return result;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                double sum=0;
                double ans=0;
                int i;
                for(i=0;i<level.size();i++){
                    sum+=level.get(i);
                }
                ans=sum/i;
                result.add(ans);
                level=new ArrayList<>();
                if(q.isEmpty()){
                    return result;
                }
                q.add(null);
            }
            else{
                level.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
       return result;
    }
}