class Solution {
    private void dfs(int row,int col,int[][] image,int[][] ans ,int color, int initialColor,
    int [] delRow, int [] delCol){
        ans[row][col]= color;
        int n = image.length;
        int m = image[0].length;
        for(int i = 0;i< 4 ; i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            if(nrow < n && nrow>=0 && ncol < m && ncol>=0 && 
            image[nrow][ncol]==initialColor && 
            ans[nrow][ncol]!=color){
                dfs(nrow,ncol,image,ans,color,initialColor,delRow,delCol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];
        int [][] ans = image;
        int [] delRow = {-1,0,1,0};
        int [] delCol ={0,1,0,-1};
        dfs(sr,sc,image,ans,color,initialColor,delRow,delCol);
        return ans;

    }
}