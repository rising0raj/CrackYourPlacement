class Solution {
    int max=0;
    public int depth(TreeNode root){
        if(root==null)
            return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        int d=l+r;
        max=Math.max(max,d);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
}
