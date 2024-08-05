class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        inorderTraversal(root,l);
        Collections.sort(l);

        return l.get(k-1);
    }

    public List<Integer> inorderTraversal(TreeNode root, ArrayList<Integer> l) {
        if(root==null){
            return l;
        }
        inorderTraversal(root.left,l);
        l.add(root.val);
        inorderTraversal(root.right,l);
        return l;

    }
}
