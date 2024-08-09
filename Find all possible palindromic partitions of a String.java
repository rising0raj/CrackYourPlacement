class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String s) {
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        
        ArrayList<String> temp=new ArrayList<>();
       partitionHelper(0, s, temp, res);
        return res;
    }

    static void partitionHelper(int index, String s, ArrayList < String > path, ArrayList < ArrayList < String >> res) {
        if (index == s.length()) {
            res.add(new ArrayList < > (path));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                partitionHelper(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
};
