class Solution {
    public boolean isConcated(String str, HashSet<String> st ){
        int l = str.length();
        for(int i=0; i<l ;i++){
            String suffix = str.substring(0,i+1);
            String prefix = str.substring(i+1);
            if((st.contains(suffix)&& st.contains(prefix) ||
             st.contains(prefix) && isConcated(suffix,st))){
                return true;
             }
        }
        return false;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        HashSet<String> st = new HashSet<>(Arrays.asList(words));
        for(String str : words){
            st.remove(str);
            if(isConcated(str,st)){
                result.add(str);
            }
            st.add(str);
        }
        return result;
    }
}