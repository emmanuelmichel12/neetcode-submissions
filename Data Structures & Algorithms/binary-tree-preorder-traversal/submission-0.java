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
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null)
        {
            return new ArrayList<>();
        }
        List<Integer> add = new ArrayList<>();
        add.add(root.val);
        List<Integer> left = preorderTraversal(root.left);
        List<Integer> right = preorderTraversal(root.right);
        List<Integer> combine = new ArrayList<>();
        combine.addAll(add);
        combine.addAll(left);
        combine.addAll(right);

        return combine;
        
    }
}