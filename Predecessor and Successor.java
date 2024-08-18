class Solution {
    
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        if(root==null)
        return;
    if(root.data<key) {
        pre[0]=root;
        findPreSuc(root.right,pre,suc,key);
    } 
    else if(root.data>key) {
        suc[0]=root;
        findPreSuc(root.left,pre,suc,key);
    } 
    else {
        findPreSuc(root.left,pre,suc,key);
        findPreSuc(root.right,pre,suc,key);
    }
}}
