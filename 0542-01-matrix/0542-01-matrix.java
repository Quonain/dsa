class Pair{
    int first;
    int second;
    int distance;
    Pair(int first,int second,int distance){
        this.first = first;
        this.second = second;
        this .distance = distance;
    }
}


class Solution {
    public int[][] updateMatrix(int[][] mat) {
      int n = mat.length;
      int m = mat[0].length;
      int [][] vis = new int [n][m];
      int ans [][]  = new int [n][m];
      Queue <Pair> q = new LinkedList<>();
      for(int i =0 ;i< n ;i++){
        for(int j= 0; j<m; j++){
            if(mat[i][j]==0){
                vis[i][j]=1;
                q.add(new Pair(i,j,0));

            }
        }
      }
      int[] delrow = {-1,0,1,0};
      int[] delcol = {0,1,0,-1};
      while(!q.isEmpty()){
        Pair it = q.poll();
        int r = it.first;
        int c = it.second;
        int d =it.distance;
        ans[r][c]=d;
        for(int i =0; i<4; i++){
            int nrow = r+delrow[i];
            int ncol = c+delcol[i];
            if(nrow >=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0){
            vis[nrow][ncol]=1;
            q.add(new Pair(nrow,ncol,d+1));
            }
        }
      }
      return ans;
    }
}