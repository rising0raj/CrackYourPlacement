class Solution {
    public String reorganizeString(String s) {
        var count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int maxCount = 0, letter = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                letter = i;
            }
        }
        
        if (maxCount > (s.length() + 1) / 2) {
            return "";
        }
        var ans = new char[s.length()];
        int index = 0;

        while (count[letter] != 0) {
            ans[index] = (char) (letter + 'a');
            index += 2;
            count[letter]--;
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (index >= s.length()) {
                    index = 1;
                }
                ans[index] = (char) (i + 'a');
                index += 2;
                count[i]--;
            }
        }

        return String.valueOf(ans);
    }
}
