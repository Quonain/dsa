class Solution {
    public boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n/2;
        int i =0;
        int j =mid;
        int cntl=0; 
        int cntR=0;
        while(i<mid && j<n){
            if(isVowel(s.charAt(i))) cntl++;
            if(isVowel(s.charAt(j))) cntR++;
            i++;
            j++;
        }
        return cntl == cntR;
    }
}