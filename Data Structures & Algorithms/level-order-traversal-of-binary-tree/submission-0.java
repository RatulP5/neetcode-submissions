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
        if(root==null) return new ArrayList<List<Integer>>();
        Deque <TreeNode> dq=new ArrayDeque<>();
        List<List<Integer>> t=new ArrayList<>();
        dq.offerLast(root);
        while(!dq.isEmpty()){
            List<Integer> lvl=new ArrayList<>();
            int len=dq.size();
            for(int i=0; i<len; i++){
                TreeNode node=dq.pollFirst();
                lvl.add(node.val);
                if(node.left!=null) dq.offerLast(node.left);
                if(node.right!=null) dq.offerLast(node.right);
            }
            t.add(lvl);
        }
        return t;
    }
}
