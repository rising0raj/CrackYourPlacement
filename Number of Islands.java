class Solution {
    private void dfs(char[][]grid,int i, int j){
        if(i>=0 && j>=0 && i<grid.length && j<grid[i].length && grid[i][j]=='1'){
            grid[i][j]='2';
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);
        }
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
