class Solution {
    public int maxProfit(int[] prices) {
       int min = prices[0];
       int maxP = 0;
       int n = prices.length;
       for(int i=1; i<n; i++ ){
        int p = prices[i]-min;
        if(p > maxP){
            maxP = p;
        } 
        min = Math.min(min, prices[i]);
       }
       return maxP;
    }
}