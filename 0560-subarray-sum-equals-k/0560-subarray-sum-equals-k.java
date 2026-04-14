class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap <Integer,Integer> st = new HashMap<>();
        int prefixsum=0;
        int cnt=0;
        st.put(0,1);
        for(int i=0;i<n;i++){
            prefixsum+=nums[i];
            int remove= prefixsum-k;
            if(st.containsKey(remove)){
                cnt+=st.get(remove);
            }
            st.put(prefixsum,st.getOrDefault(prefixsum,0)+1);

        }
        return cnt;
    }
}