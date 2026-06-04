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
        int cnt=0;
    public int goodNodes(TreeNode root) {
        int s=root.val;
        helper(root,s);
        return cnt;
    }
    void helper(TreeNode root,int s){
        if(root==null) return;
        if(root.val>=s){
            cnt+=1;
            s=root.val;
        }
        if(root.left!=null) helper(root.left,s);
        if(root.right!=null) helper(root.right,s);
    }
}
