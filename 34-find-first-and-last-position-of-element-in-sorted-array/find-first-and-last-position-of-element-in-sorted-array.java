class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result =new int [2];
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;
    }
    private int findFirst(int [] nums,int target){
        int idx=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            if(nums[mid]==target){
            idx=mid;
        }
        }
        return idx;
        

    }
    private int findLast(int[] nums,int target){
       int idx=-1;
       int low=0;
       int high=nums.length-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]<=target){
            low=mid+1;
        }
        else {
            high=mid-1;
        }
        if(nums[mid]==target){
            idx=mid;
        }
       }
       return idx; 
    }

}