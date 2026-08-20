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
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null)
        {
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);
        int diameter = left + right;
        int sub = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));

        return Math.max(diameter, sub);
    }

    public int helper(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        
        int val1 = helper(root.left);
        int val2 = helper(root.right);


        return Math.max(val1, val2) + 1;
    }
}
