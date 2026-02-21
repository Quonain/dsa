class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      int [][] vis = new int [n][m];
     Queue<Pair> q = new LinkedList<>();
     int countFresh=0;
     for(int i= 0; i<n ;i++){
        for(int j= 0; j<m; j++){
            if(grid[i][j]==2){
                vis[i][j]=2;
                q.add(new Pair(i,j,0));
            }
            else{
                if (grid[i][j]==1){
                    countFresh++;
                }
            }
        }
     }
        int maxtime= 0;
        int count=0;
        int [] delrow = {-1,0,1,0};
        int [] delcol = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair it = q.poll();
            int r = it.row;
            int c = it.col;
            int t= it.time;
            maxtime= Math.max(t,maxtime);
            for(int k =0 ; k<4; k++){
                int nrow = r+delrow[k];
                int ncol= c+delcol[k];
                if(nrow>=0 && nrow <n && ncol >=0 && ncol<m && vis[nrow][ncol]==0
                && grid[nrow][ncol]==1){
                    vis[nrow][ncol]=2;
                    count++;
                    q.add(new Pair(nrow,ncol,t+1));
                }
            }
            

        }
        if(count == countFresh){
            return maxtime;
        }
        else{
            return -1;
        }

     }  
    }
