class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=heights.length;
        for(int i=0;i<heights.length-1;i++){
            int diff=heights[i+1]-heights[i];
            if(diff>0){
                if(pq.size()<ladders){
                    pq.add(diff);
                }else{
                    if(pq.size()>0 && pq.peek()<diff){
                        int temp=diff;
                        diff=pq.remove();
                        pq.add(temp);
                    }
                    if(bricks>=diff){
                        bricks-=diff;
                    }else{
                        return i;
                    }
                }
            }
        }
        return n-1;
    }
}
