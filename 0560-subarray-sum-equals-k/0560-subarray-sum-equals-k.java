class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap <>();
       int n = nums.length;
       int ps = 0;
       int cnt =0;
       map.put(0,1);
       for(int i =0 ;i< n; i++){
        ps+= nums[i];
        int remove = ps-k;
        if(map.containsKey(remove)){
            cnt+=map.get(remove);
        }

        map.put(ps,map.getOrDefault(ps,0)+1);
       }
       return cnt;
    }
}