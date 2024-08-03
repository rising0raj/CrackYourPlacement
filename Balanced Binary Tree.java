class Solution {
    public boolean isBalanced(TreeNode root) {

        return (Balanced(root) >= 0);
    }
    public int Balanced(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = Balanced(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = Balanced(root.right);
        if(rh == -1){
            return -1;
        }
        if(Math.abs(lh -rh) > 1){
            return -1;
        }
        return(Math.max(lh,rh) + 1);
    }
}
