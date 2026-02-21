class Solution {
    private void dfs (int row, int col , int[][] vis, char[][] grid){
        vis[row][col]=1;
        int n = grid.length;
        int m = grid[0].length;
        int [] delrow = {-1,0,1,0};
        int [] delcol = {0,1,0,-1};
        for(int i =0 ; i<4; i++){
            int nrow = row+delrow[i];
            int ncol = col+delcol[i];
            if(nrow<n && nrow>=0 && ncol<m && ncol>=0  && vis[nrow][ncol]==0 &&
            grid[nrow][ncol]=='1'){
                dfs(nrow,ncol,vis,grid);
            }
        }

    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] vis = new int [n][m];
        int count= 0;
        for(int i =0; i<n ;i++){
            for(int j =0; j<m ;j++){
                if(vis[i][j]==0 && grid[i][j] =='1'){
                    count++;
                    dfs(i,j,vis,grid);
                }
            }
        }
    return count;
    }
}