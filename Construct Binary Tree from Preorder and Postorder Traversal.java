class Solution {
    int curr=0;
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<post.length;i++){
            map.put(post[i],i);
        }

        return help(pre,post,map,0,post.length-1);
    }

    public TreeNode help(int pre[],int post[],HashMap<Integer,Integer> map,int start, int end){
        if(start>end){
            return null;
        }

        TreeNode root=new TreeNode(pre[curr++]);

        if(start==end){
            return root;
        }
        int index=map.get(pre[curr]);

        root.left=help(pre,post,map,start,index);
        root.right=help(pre,post,map,index+1,end-1);

        return root;
    }
}
