class Solution {

    private int maxLength(int[][] arr,int col){
        int max=Integer.MIN_VALUE;
        int l=arr.length;
        int index=-1;
        for(int i=0;i<l;i++){
         if (arr[i][col]>max){
            max=arr[i][col];
            index=i;
         }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int r=mat.length;
        int col=mat[0].length;
        int low=0;
        int high=col-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=maxLength(mat,mid);
            int left= mid-1>=0 ? mat[row][mid-1] : Integer.MIN_VALUE;
            int right = mid+1 < col ? mat[row][mid+1] : Integer.MIN_VALUE;
            if(mat[row][mid] > left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            if(mat[row][mid] < left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[] {-1,-1};

    }
}