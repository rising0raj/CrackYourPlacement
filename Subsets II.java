class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public static void helper(int idx,int arr[],List<List<Integer>>ans,List<Integer>list){


       ans.add(new ArrayList<>(list)); 
      for(int i=idx ; i<arr.length;i++){
        if(i!=idx && arr[i]==arr[i-1])continue;

        list.add(arr[i]);
        helper(i+1,arr,ans,list);
        list.remove(list.size()-1);
      }
    }
}
