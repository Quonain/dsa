class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack <>();
        for(char ele : s.toCharArray()){
            if(ele == '(' || ele == '{' || ele == '['){
                st.push(ele);
            }
            else if(st.isEmpty()){
                return false;
            }
            else
            {
                char ch  = st.peek();
                st.pop();
                if((ch == '{' && ele == '}') ||
                (ch == '[' && ele == ']') ||
                (ch == '(' && ele == ')')){
                    continue;
                }
                else return false;


            }
           
        }
         return st.isEmpty();
    }
}