class Solution {
    int currlevel=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();

        solve(ans,root,1);
        
        return ans;
    }

    public void solve(List<Integer> ans, TreeNode root,int level){
        if(root==null){
            return;
        }

        if(currlevel<level){
            ans.add(root.val);
            currlevel=level;
        }
        solve(ans,root.right,level+1);
        solve(ans,root.left,level+1);
    }
}
