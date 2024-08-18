class Solution{
    static int largestBst(Node root) {
        if (root == null) return 0;
        int[] maxsize = new int[1];
        maxsize[0] = 0;
        findLargest(root, maxsize);
        return maxsize[0];
    }

    static void findLargest(Node root, int[] maxsize) {
        if (root == null) return;
        
        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            int size = getSize(root);
            if (size > maxsize[0]) {
                maxsize[0] = size;
            }
        }
        
        findLargest(root.left, maxsize);
        findLargest(root.right, maxsize);
    }

    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) {
            return false;
        }
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }

    static int getSize(Node root) {
        if (root == null) return 0;
        return getSize(root.left) + getSize(root.right) + 1;
        
        
    }
    
}
