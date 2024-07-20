class Solution {
    public int findMaxValueOfEquation(int[][] p, int k) {
        int res=Integer.MIN_VALUE;
        int i=0,f=1;

        while(i<p.length){
            if(f<i+1){
                f=i+1;
            }

            for(int j=f;j<p.length;j++){
                if(p[j][0]>p[i][0]+k){
                    break;
                }

                if(p[i][1]+p[j][1]+p[j][0]-p[i][0]>res){
                    res=p[i][1]+p[j][1]+p[j][0]-p[i][0];
                    f=j-1;
                }
                
            }
            i++;

        }
        return res;
    }
}
