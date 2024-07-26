class Solution {
    public boolean check(TreeNode left, TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null || left.val!=right.val)
            return false;
        return check(left.left,right.right) && check(left.right,right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
}
