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
    public List<Integer> postorderTraversal(TreeNode root) {

        if(root == null)
        {
            return new ArrayList<>();
        }

        List<Integer> left = postorderTraversal(root.left);
        List<Integer> right = postorderTraversal(root.right);
        List<Integer> add = new ArrayList<>();
        add.add(root.val);
        List<Integer> combine = new ArrayList<>();
        combine.addAll(left);
        combine.addAll(right);
        combine.addAll(add);

        return combine;
        
    }
}