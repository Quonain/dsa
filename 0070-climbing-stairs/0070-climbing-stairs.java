class Solution {
    public int cp(int n,int[] dp){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int nm1 = cp(n-1,dp);
        int nm2 = cp(n-2,dp);
        int count  = nm1+nm2;
        dp[n]= count;
        return dp[n];
    }
    public int climbStairs(int n) {
    int[] dp = new int [n+1];
    Arrays.fill(dp,-1);
    return cp(n,dp);
       
    }
}