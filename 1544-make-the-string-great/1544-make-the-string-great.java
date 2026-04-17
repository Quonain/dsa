class Solution {
    public String makeGood(String s) {
        StringBuilder result = new StringBuilder ();
        for(char ch : s.toCharArray()){
            int len = result.length();
            if(len > 0 && (ch-32 == result.charAt(len-1) || ch+32 == result.charAt(len-1))){
                result.deleteCharAt(len-1);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}