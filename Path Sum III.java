class Solution {
    int ans=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        help(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);

        return ans;

    }

    public void help(TreeNode root,int ta,long s){
        if(root==null){
            return;
        }

        s+=root.val;

        if(s== ta){
            ans++;
        }

        help(root.left,ta,s);
        help(root.right,ta,s);
    }
}
