class Solution {
    private void dfs(int r, int c, char[][] board, int[][] vis){
    vis[r][c]=1;
    int [] delRow = {-1,0,1,0};

    int [] delCol ={0,1,0,-1};
    int n = board.length;
    int m = board[0].length;
    for(int i = 0;i<4;i++){
        int nrow = r+delRow[i];
        int ncol = c+delCol[i];
        if(nrow>=0 &&  nrow<n  && ncol>=0 && ncol<m && vis[nrow][ncol]==0 &&
         board[nrow][ncol]=='O' ){
            dfs(nrow,ncol,board,vis);
         }
    }
    }
    public void solve(char[][] board) {
        int n  = board.length;
        int m = board[0].length;
        int vis [][] = new int [n][m];
        for(int i =0 ; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i==0 || j==0 || i==n-1 || j == m-1){
                  if(board[i][j]=='O'&& vis[i][j]==0){
                 dfs(i, j, board, vis);
                  }
                    
                }
            }
        } 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m ; j++){
                if(vis[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        return;
    }
}