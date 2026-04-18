class Solution {
    public boolean checkFreq( String s){
        char [] arr = new char[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
            if(arr[ch - 'a'] > 1){
                return true;
            }
        }
        return false;
    }
    public boolean buddyStrings(String s, String goal) {
        int n =s.length();
        int m = goal.length();
        if(n!=m){
            return false;
        }
        if(s.equals(goal)){
            return checkFreq(s);
        }
        List<Integer> indices = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                indices.add(i);
            }
        }
        if(indices.size() != 2){
            return false;
        }
        int first = indices.get(0);
        int second = indices.get(1);

        char [] arr = s.toCharArray();
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        return new String(arr).equals(goal);
    }
}