class Solution {

private int splitIntoTwo(int[] nums, int value){
    int num=0;
    int split=1;
    for(int n : nums){
        if(n+num <= value){
            num+=n;
        }
        else{
            split++;
            num=n;
        }
    }
    return split;
}

    public int splitArray(int[] nums, int k) {
        if(nums.length<k){
            return -1;
        }
        int low= Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        while(low<=high){
            int mid=low+(high-low)/2;
            int split=splitIntoTwo(nums,mid);
            if(split>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}