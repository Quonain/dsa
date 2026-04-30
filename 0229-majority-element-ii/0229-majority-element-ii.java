class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i =0 ; i< nums.length; i++){
            if(cnt1 == 0 && el2 != nums[i] ){
                el1 = nums[i];
                cnt1++;
            }
            else if(cnt2 == 0 && el1 != nums[i] ){
                el2 = nums[i];
                cnt2++;
            }
            else if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i] == el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int mini = nums.length /3;
        List<Integer> ans = new ArrayList<>();
        int cntt1=0;
        int cntt2=0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] == el1){
                cntt1++;
            }
            else if(nums[i] == el2) {
                cntt2++;
            }
        }
        if(cntt1 > mini){
            ans.add(el1);
        }
        if(cntt2 > mini){
            ans.add(el2);
        }
        return ans;
    }
}