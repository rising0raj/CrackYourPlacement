class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(n, k, new ArrayList<Integer>(), result);
        return result;
    }
    private void generateCombinations( int n, int k, List<Integer> combination, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if(n==0){
            return;
        }
        combination.add(n);
        generateCombinations(n-1,k-1,combination,result);
        combination.remove(combination.size()-1);
        generateCombinations(n-1,k,combination,result);

    }
}
