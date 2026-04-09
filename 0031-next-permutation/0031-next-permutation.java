class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            rev(nums,0,nums.length-1);
            return;
        }
        for(int i = nums.length-1; i>=0 ; i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        rev(nums,ind+1,nums.length-1);
    }
    public void rev(int[] nums,int start,int last){
        while(start<last){
            swap(nums,start,last);
            start++;
            last--;
        }
        
    }
    public void swap(int[] nums,int start,int last){
        int temp = nums[start];
        nums[start]= nums[last];
        nums[last]= temp;
    }
}