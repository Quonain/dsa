class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s==null){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        HashSet<Character>set=new HashSet<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<s.length()){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}