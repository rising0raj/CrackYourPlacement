class Solution {
    private int[][] t;

    private int solve(int i, int j, String s) {
        if (i >= j)
            return 0;

        if (t[i][j] != -1)
            return t[i][j];

        if (s.charAt(i) == s.charAt(j))
            return t[i][j] = solve(i + 1, j - 1, s);

        return t[i][j] = 1 + Math.min(solve(i, j - 1, s), solve(i + 1, j, s));
    }
    public int minInsertions(String s) {
        int n = s.length();
        t = new int[n][n];

        for (int[] row : t)
            Arrays.fill(row, -1);

        return solve(0, n - 1, s);
    }
}
