import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        StringBuilder result = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            StringBuilder reversedToken = new StringBuilder(token).reverse();
            result.append(reversedToken).append(" ");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}
