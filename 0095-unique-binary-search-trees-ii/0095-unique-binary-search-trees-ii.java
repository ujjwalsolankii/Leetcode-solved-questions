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
    List<TreeNode> solve(int start , int end){
        List<TreeNode> res = new ArrayList<>();
        if(start>end){
            res.add(null);
            return res;
        }
        
        for(int i = start; i<=end; i++){
            List<TreeNode> left = solve(start, i-1);
            List<TreeNode> right = solve(i+1, end);
            
            for(TreeNode left_node : left){
                for(TreeNode right_node : right){
                    TreeNode root = new TreeNode(i);
                    root.left = left_node;
                    root.right = right_node;
                    res.add(root);
                }
            }
        }
        return res;
    }
        
    public List<TreeNode> generateTrees(int n) {
        return solve(1,n);
    }
}