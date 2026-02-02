class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;

        int n=matrix.length;
        int m=matrix[0].length;
        int high=(m*n)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int r=mid/m;
            int c=mid%m;
           if( matrix[r][c] ==target){
            return true;
           }
           else if( matrix[r][c]>target){
            high=mid-1;
           }
           else{
            low=mid+1;
           }
        }
        return false;
        
    }
}