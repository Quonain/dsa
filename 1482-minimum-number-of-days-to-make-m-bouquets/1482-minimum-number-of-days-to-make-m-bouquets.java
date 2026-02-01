class Solution {

    private boolean isPossible (int[] bloomDay,int day,int m,int k){
        int bouquets=0;
        int count=0;
        for(int bloom:bloomDay){
            if(bloom<=day){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }
            else{
                count=0;
            }

        }
      return bouquets>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k){
            return -1;
        }
        int max=Arrays.stream(bloomDay).max().getAsInt();
        int min=Arrays.stream(bloomDay).min().getAsInt();
      
      int low=min;
      int high=max;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(isPossible(bloomDay,mid,m,k)){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return low;
    }
}