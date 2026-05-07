class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(arr);
        int  minD = Integer.MAX_VALUE;
         //find min
         for(int i = 1; i<arr.length ; i++){
          minD = Math.min(minD, arr[i]-arr[i-1]);
         }
         for(int i = 1 ;i< arr.length; i++){
            if( (arr[i] - arr[i-1]) == minD){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
         }
         return ans;
    }
}