class Solution {
    public int maxProfit(int[] p) {
        int pro=0;
        for(int i=1;i<p.length;i++){
            if(p[i]>p[i-1]){
                pro+= p[i]-p[i-1];
            }
        }

        return pro;
    }
}
