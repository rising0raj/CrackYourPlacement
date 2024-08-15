class Solution {
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        camera = 0;
        int ans = solve(root);
        return (ans == 0) ? ++camera:camera;
    }

    private int solve(TreeNode root) {
        if(root == null) return 1;

        int left = solve(root.left);
        int right = solve(root.right);

        if(left == 0 || right == 0) {
            camera++;
            return 2;
        }

        if(left == 1 && right == 1) {
            return 0;
        }

        if(left == 2 || right == 2) {
            return 1;
        }

        return -1;   
    }
}
