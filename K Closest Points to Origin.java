class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(a,b)->{return a[0]*a[0]+a[1]*a[1] - (b[0]*b[0]+b[1]*b[1]);});
        int[][] sol = new int[k][2];
        for(int i=0;i<k;i++){
            sol[i] = points[i];
        }
        return sol;
    }
}
