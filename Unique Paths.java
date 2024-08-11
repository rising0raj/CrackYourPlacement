class Solution {
    int t[][];
    public int help(int i,int j,int m,int n){
        if(i<0||j<0||i>=m||j>=n){
            return 0;
        }

        if(i==m-1 && j==n-1){
            return 1;
        }

        if(t[i][j] != -1) 
            return t[i][j];
        
        return t[i][j]=help(i,j+1,m,n)+help(i+1,j,m,n);
    }


    public int uniquePaths(int m, int n) {
        t=new int[m][n];
        for(int row[]:t){
            Arrays.fill(row,-1);
        }

        return help(0,0,m,n);
    }
}
