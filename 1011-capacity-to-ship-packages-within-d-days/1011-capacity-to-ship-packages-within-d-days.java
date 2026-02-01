class Solution {

    private int daysNeeded(int[] weights,int capacity){
        int load=0;
        int day=1;
        for(int w:weights){
            if(load+w>capacity){
            day++;
            load=w;
            }
            else{
                load+=w;
            }
        }
        return day;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        while(low<=high){
            int mid = low+(high-low)/2;
            int needed=daysNeeded(weights,mid);
            if(needed<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
}