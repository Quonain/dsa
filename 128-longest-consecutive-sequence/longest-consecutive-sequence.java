class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer>map=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int longestSub=1;
        for(int n:map){
            if(map.contains(n-1)){
                continue;
            }
            else{
                int currentNum=n;
                int currentSub=1;
                while(map.contains(currentNum+1)){
                    currentSub++;
                    currentNum++;
                }
            longestSub= Math.max(longestSub,currentSub);
            }
        }
        return longestSub;

     }
}