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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans =new ArrayList<>();
        if(root== null )    return ans;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> li = new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode a = queue.peek();
                if(a.left != null)  queue.add(a.left);
                if(a.right != null)  queue.add(a.right);
                li.add(a.val);
                queue.remove();
            }
            ans.add(li);
        }
        return ans;
    }
}