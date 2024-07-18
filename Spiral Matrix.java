class Solution {
    public List<Integer> spiralOrder(int[][] ma) {
        int n=ma.length,m=ma[0].length;

        int left=0,top=0,right=m-1,bottom=n-1;

        List<Integer> res = new ArrayList<>();

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                res.add(ma[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                res.add(ma[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(ma[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(ma[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}
