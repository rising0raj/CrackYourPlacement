class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return root!=null ? sumOfLeftLeaves(root, 0, false) : 0;
    }
    
    private int sumOfLeftLeaves(TreeNode root, int sum, boolean isLeftNode) {
        if(isLeftNode && root.left==null && root.right==null)return root.val;
        if(root.left!=null)sum+= sumOfLeftLeaves(root.left, 0, true);
        if(root.right!=null)sum+= sumOfLeftLeaves(root.right, 0, false);
        return sum;
    }
}
