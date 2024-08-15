class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxi = {Integer.MIN_VALUE};
        solve(root, maxi);
        return maxi[0];
    }
    private int solve(TreeNode root,int maxi[]){
        if(root==null){
            return 0;
        }
        int leftMaxPath = Math.max(0, solve(root.left, maxi));
        int rightMaxPath = Math.max(0, solve(root.right, maxi));
        maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath + root.val);
        return Math.max(leftMaxPath, rightMaxPath) + root.val;
    }
}
