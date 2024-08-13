public class Codec {
    public String serialize(TreeNode root) 
    {
        if (root == null) 
            return "#";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }
    public TreeNode deserialize(String data) 
    {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return help(queue);
    }
    private TreeNode help(Queue<String> queue) 
    {
        String s = queue.poll();
        if (s.equals("#")) 
            return null;
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = help(queue);
        root.right = help(queue);
        return root;
    }
}
