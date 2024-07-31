class Solution {
    public static void backtrack(List<List<Integer>> ans, int s, int nums[]){
        if(s==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i:nums){
                temp.add(i);
            }
            if(!ans.contains(temp)){
                ans.add(temp);
            }
            return;
        }

        for(int i=s;i<nums.length;i++){
            swap(nums,s,i);
            backtrack(ans,s+1,nums);
            swap(nums,s,i);
        }
    }
    private static void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,0, nums);
        return ans;
    }
}
