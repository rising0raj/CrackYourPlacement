class Solution {
    public String reverseWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0)
                reversed.append(" ");
        }
        return reversed.toString();
    }
}
