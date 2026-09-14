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
    public boolean isValidBST(TreeNode root) {
        List<Integer> nodes=new ArrayList<>();
        inorder(root, nodes);
        for(int i=1; i<nodes.size(); i++){
            if(nodes.get(i-1)>=nodes.get(i)) return false;
        }
        return true;
    }
    public void inorder(TreeNode root, List nodes){
        if(root==null) return;
        inorder(root.left, nodes);
        nodes.add(root.val);
        inorder(root.right, nodes);
    }
}
