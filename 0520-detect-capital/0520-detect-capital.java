class Solution {
    public boolean detectCapitalUse(String word) {
        int cntCapital = 0;
         for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)){
                cntCapital++;
            }
         }
         if(cntCapital==0){
            return true;
         }
         if(cntCapital == word.length()){
            return true;
         }
         if(cntCapital== 1 && Character.isUpperCase(word.charAt(0))){
            return true;
         }
         return false;
    }
}