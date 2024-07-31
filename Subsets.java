class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> current, int[] nums, int index) {
        if(index == nums.length){
            list.add(new ArrayList<>(current)); 
            return;
        }
        backtrack(list, current, nums, index + 1);
        current.add(nums[index]);
        backtrack(list, current, nums, index + 1);
        current.remove(current.size() - 1);
    }

}
