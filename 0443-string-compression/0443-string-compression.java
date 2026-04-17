class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx=0;
        int i = 0;
        while(i<n){
            char curr=chars[i];
            int cnt=0;
            //count repeataion
            while(i<n && curr==chars[i]){
                cnt++;
                i++;
            }
            //place character
            chars[idx]=curr;
            idx++;

            //placing cnt if > 1

            if(cnt>1){
                String cntstr = Integer.toString(cnt);
                for(char ch : cntstr.toCharArray()){
                    chars[idx]=ch;
                    idx++;
                }
            }
        }
        return idx;
    }
}