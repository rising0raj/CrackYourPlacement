class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       int[] count = new int[nums.length];
       List<Integer> ans = new ArrayList();
       for(int num: nums){
         if(count[num-1]==0) count[num-1]++;
         else ans.add(num);
       }
       return ans;
    }
}
