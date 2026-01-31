class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0|| nums==null || k<=0){
            return new int [0];
        }
      
      int n = nums.length;
      int [] result=new int[n-k+1];
      Deque<Integer>deque=new LinkedList<>();
      for(int i=0;i<n;i++){//sb kch example le ke smjh k=3,r i=2 ho gya maanle sbse bda element 0index m h
       while(!deque.isEmpty() && deque.peek() < i - k + 1){
        deque.poll();
       }
 //agr av wala element sbse bda h toh sbko nikalo but check from top to bottom
       while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
        deque.pollLast();
       }
       deque.offer(i);//last me add kr rha mtlb upr 
       if(i>=k-1){
        result[i-k+1]=nums[deque.peek()];
       }

      }

      return result;



    }
}