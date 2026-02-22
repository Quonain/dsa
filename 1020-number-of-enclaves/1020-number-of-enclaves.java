class Pair{
    int r;
    int c;
    Pair(int r,int c){
        this.r = r;
        this.c = c;
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int [n][m];
        Queue <Pair> q = new LinkedList<>();
        for(int i = 0; i< n ; i++){
            for(int j =0 ; j< m ; j++){
                if((i==0 || j == 0 || i == n-1 || j == m-1) && grid[i][j] == 1){
                    q.add(new Pair(i,j));
                }
            }
        }
        int []delrow  = {-1,0,1,0};
        int [] delcol = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair it = q.poll();
            int row = it.r;
            int col = it.c;
            vis[row][col] = 1;
            for(int i =0; i<4; i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow >=0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol]==0 
                && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol));
                }
            }
        }
        int count =0; 
        for(int i = 0; i< n ; i++){
            for(int j =0 ; j<m; j++){
                if(vis[i][j]==0 && grid [i][j]==1){
                    count ++;
                }
            }
        }
        return count;

    }
}