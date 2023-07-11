/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
//         List<Integer> res = new ArrayList<>();
//         if(root==null) return res;
//         HashMap<TreeNode , TreeNode> parentMap = new HashMap<>();
//         findParent (parentMap , root);
//         Queue<TreeNode> q = new LinkedList<>();
//         HashSet<TreeNode> visited = new HashSet<>();
//         q.add(target);
        
//         while(!q.isEmpty()){
//             int size = q.size();
//             for(int i=0; i<size; i++){
//                 TreeNode curr = q.poll();
//                 visited.add(curr);
//                 if(k==0){
//                     res.add(curr.val);
//                 }
//                 if(parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))){
//                     q.add(parentMap.get(curr));
//                 }
//                 if(curr.left)
//             }
//         }
//     }
// }
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(k == 0) return List.of(target.val);
        Map<Integer, TreeNode> parentNodeMap = new HashMap<>(); // <node:parent>
        populateParentMap(root, null, parentNodeMap);
        List<Integer> result = new ArrayList<>();
        addNodesAtDistanceK(target, null, 0, k, parentNodeMap, result);
        return result;
    }

    void addNodesAtDistanceK(TreeNode node, TreeNode prev, int dis, int k, Map<Integer, TreeNode> parentNodeMap, List<Integer> result) {
        if(node == null) return;
        if(dis == k) {
            result.add(node.val);
            return;
        }
        TreeNode parent = parentNodeMap.get(node.val);
        if(dis == 0 || (parent != null && parent.val != prev.val)) {
            addNodesAtDistanceK(parent, node, dis + 1, k, parentNodeMap, result);
        }
        if(dis == 0 || (node.left != null && node.left.val != prev.val)) {
            addNodesAtDistanceK(node.left, node, dis + 1, k, parentNodeMap, result);
        }
        if(dis == 0 || (node.right != null && node.right.val != prev.val)) {
            addNodesAtDistanceK(node.right, node, dis + 1, k, parentNodeMap, result);
        }
    }

    void populateParentMap(TreeNode node, TreeNode parent, Map<Integer, TreeNode> parentNodeMap) {
        if(node == null) return;
        parentNodeMap.put(node.val, parent);
        populateParentMap(node.left, node, parentNodeMap);
        populateParentMap(node.right, node, parentNodeMap);
    }
}