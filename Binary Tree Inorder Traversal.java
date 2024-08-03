class Solution {
    List<Integer> l=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return l;
        }
        inorderTraversal(root.left);
        l.add(root.val);
        inorderTraversal(root.right);
        return l;

    }
}
