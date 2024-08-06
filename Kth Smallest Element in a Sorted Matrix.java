class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length, m=matrix[0].length,res[]=new int[n*m],a=0;

        for(int i[]:matrix){
            for(int j:i){
                res[a]=j;
                a++;
            }
        }

        Arrays.sort(res);

        return res[k-1];
    }
}
