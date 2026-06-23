class Solution {
    public int largestHeight(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int total =0;
        for(int i =0; i< n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int el = arr[st.pop()];
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
               total = Math.max(total, ((nse-pse-1)*el));
            }


            st.push(i);
        }
        while(!st.isEmpty()){
            int el = arr[st.pop()];
        int nse=n;
        int pse = st.isEmpty() ? -1 : st.peek();
       total = Math.max(total, ((nse-pse-1)*el));
        }
        return total;
    }
    public int maximalRectangle(char[][] matrix) {
        int maxArea =0;
          if (matrix.length == 0) return 0;
        int c = matrix[0].length;
        int r = matrix.length;
        int [] height = new int [c];
        for(int i =0; i< r; i++){
            for(int j =0 ; j< c ;j++){
                if(matrix[i][j] == '1'){
                    height[j]++;
                }
                else{
                    height[j] = 0 ;
                }
            }
            maxArea = Math.max(maxArea, largestHeight(height));

        }
        return maxArea;


    }
}