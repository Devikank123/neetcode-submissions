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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return null;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode x=q.poll();
                TreeNode temp=x.left;
                x.left=x.right;
                x.right=temp;

                if(x.left!=null) q.add(x.left);
                if(x.right!=null) q.add(x.right);
            }
        }
        return root;
    }
}
