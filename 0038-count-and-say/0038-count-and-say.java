class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }

        String say = countAndSay(n-1);
        StringBuilder result = new StringBuilder();
        //count
        for(int i=0;i<say.length();i++){
            int count=1;
            char ch = say.charAt(i);
            while(say.length()-1 > i && ch==say.charAt(i+1)){
                count++;//11-->21 return krega iska ex leke solve kr
                i++;
            }
            result.append(count).append(ch);

        }
        return result.toString();

    }
}