class Solution {
    private void dfs(int[][] images, int r, int c,int color,int initial){
        images[r][c]=color;
        int n = images.length;
        int m = images[0].length;
        int [] delrow = {-1,0,1,0};
        int [] delcol = {0,1,0,-1};
        for(int i =0 ; i< 4; i++){
            int nrow = r+delrow[i];
            int ncol = c+delcol[i];
            if(nrow<n && nrow >= 0 && ncol < m && ncol >=0 && images[nrow][ncol]==initial){
                dfs(images,nrow,ncol,color,initial);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         
        int initial = image[sr][sc];
        if(initial == color){
            return image;
        }
        dfs(image, sr,sc,color,initial);
        return image;

    }
}