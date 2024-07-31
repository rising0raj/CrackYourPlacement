class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, candidates, target, 0, new ArrayList<>(), 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, int[] candidates, int target, int sum, List<Integer> temp, int start) {
        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            sum += candidates[i];
            temp.add(candidates[i]);
            backtrack(ans, candidates, target, sum, temp, i + 1);
            sum -= candidates[i];
            temp.remove(temp.size() - 1);
        }
    }
}
