class Solution {
    private int sum(int []nums,int div){
        int sum=0;
        for(int num:nums){
        sum+=Math.ceil((double)num/div);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold){
            return -1;
        }
        int low = 0;
        int high= Arrays.stream(nums).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sum(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}