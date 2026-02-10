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
     List<List<Integer>> ans = new ArrayList<>();
     if(root == null){
        return ans;
     }
     Queue<TreeNode> q = new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
        //printing watever is in the queue in one level && same time we are checking and adding if their exist their right or left and if yes we are adding it to q for for printing next level
        int size = q.size();//q size determines the no. of element in that level
        List <Integer> level = new ArrayList<>();
        for(int i=0; i<size; i++){
            TreeNode node = q.poll();
            level.add(node.val);
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
        ans.add(level);
     }
     return ans;
}
}