class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrder(root, values);
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < values.size(); i++) {
            minDiff = Math.min(minDiff, values.get(i) - values.get(i - 1));
        }
        return minDiff;
    }
    private void inOrder(TreeNode node, List<Integer> values) {
        if (node == null) return;
        inOrder(node.left, values);
        values.add(node.val);
        inOrder(node.right, values);
    }
}
