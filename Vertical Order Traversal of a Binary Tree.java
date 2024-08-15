class Tuple{
    TreeNode node;
    int level;
    int vertical;
    public Tuple(TreeNode node,int vertical,int level){
        this.node=node;
        this.level = level;
        this.vertical=vertical;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        TreeMap<Integer , TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            TreeNode curr = tuple.node;
            int level = tuple.level;
            int vertical = tuple.vertical;
            if(!map.containsKey(vertical)){
                map.put(vertical,new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(level)){
                map.get(vertical).put(level, new PriorityQueue<>());
            }
            map.get(vertical).get(level).add(curr.val);
            if(curr.left!=null){
                q.add(new Tuple(curr.left,vertical-1,level+1));
            }
            if(curr.right!=null){
                q.add(new Tuple(curr.right,vertical+1,level+1));
            }

        }
        for (TreeMap < Integer, PriorityQueue<Integer>> tm: map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> pq: tm.values()) {
                while (!pq.isEmpty()) {
                    list.get(list.size() - 1).add(pq.poll());
                }
            }
        }
        return list;
    }
}
