class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] seen = new boolean[26];
        int cnt=0;
        for(char ch : sentence.toCharArray()){
            int index= ch-'a';
            if(!seen[index]){
                seen[index]=true;
                cnt++;
            }
            if(cnt==26){
                return true;
            }
        }
        return false;
    }
}