class Solution {
     private int CalculateTotalHours(int [] piles,int speed){
        long totalH=0;
        for(int bananas:piles){
            totalH+=(int)Math.ceil((double)bananas/speed);
        }
        return totalH;
     }

    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=Arrays.stream(piles).max().getAsInt();
        int low=1;
        int high=maxPile;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalH=CalculateTotalHours(piles,mid);
            if(totalH <= h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}