class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];        
        int maxOccurs = 0, result = 0;
        int left = 0, right = 0;

        while (right < s.length()) {
            map[s.charAt(right) - 'A']++;            
            maxOccurs = Math.max(maxOccurs, map[s.charAt(right) - 'A']);

            if (maxOccurs + k < right - left + 1) {        
                map[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }
}
