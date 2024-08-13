
class BSTIterator {
private    Stack<TreeNode>stack;

    public BSTIterator(TreeNode root) {
       stack = new Stack<>();
        leftTraversal(root); 
    }
    private void leftTraversal(TreeNode root)
    {
        while(root!=null)
        {
            stack.push(root);
            root=root.left;
        }
    }
    public int next() {
        TreeNode node = stack.pop();
        if(node.right!=null)
        {
            leftTraversal(node.right);
        }
        return node.val;
    }
    
    public boolean hasNext() {
        if(stack.isEmpty())
        {
            return false;
        }
        else{
            return true;
        }
    }
}
