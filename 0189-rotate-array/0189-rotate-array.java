class Solution {
    public void reverse(int[] num,int start, int end){
     while(end>start){
    int temp = num[start];
       num[start]=num[end];
       num[end]=temp;
        start++;
        end--;
     }   
    }
    public void rotate(int[] nums, int k) {
      int n = nums.length;
      
      k = k%n;
      reverse(nums,0,n-1);
      reverse(nums,0,k-1);
      reverse(nums,k,n-1);
    }
}