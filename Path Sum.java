class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return help(root,0,targetSum);
    }

    private boolean help(TreeNode root, int sum , int k){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            sum+=root.val;
            if(sum==k){
                return true;
            }
        } 

        return help(root.left,sum+root.val,k) || help(root.right,sum+root.val,k);
    }
}
