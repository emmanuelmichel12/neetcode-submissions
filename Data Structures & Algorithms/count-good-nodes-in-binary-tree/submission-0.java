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
    public int goodNodes(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int count = helper(root, root.val);

        return count;
        
    }

    public int helper(TreeNode root, int val)
    {
        if(root == null)
        {
            return 0;
        }

        if(root.val >= val)
        {
            return 1 + helper(root.left, root.val) + helper(root.right, root.val);
        }

        return 0 + helper(root.left, val) + helper(root.right, val);
    }
}
