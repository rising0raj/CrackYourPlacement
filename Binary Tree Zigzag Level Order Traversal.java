class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();

        if(root==null)
            return res;
        
        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        boolean travel=true;

        while(!q.isEmpty()){
            int size=q.size();

            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                if(travel){
                    temp.add(n.val);
                }else{
                    temp.addFirst(n.val);
                }
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
            res.add(temp);
            travel=!travel;
        }
        return res;
    }
}
