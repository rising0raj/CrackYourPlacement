class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] target = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, target[i], 0, matrix[i].length);
        }
        int c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    c=j;
                    for(int k=0;k<matrix[i].length;k++){
                        target[i][k]=0;
                    }
                    for(int m=0;m<matrix.length;m++){
                        target[m][c]=0;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy( target[i], 0,matrix[i], 0, target[i].length);
        }


        
    }
}
