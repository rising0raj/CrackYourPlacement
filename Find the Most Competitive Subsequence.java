class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int res[]=new int[k];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]<st.peek() && nums.length-i>k-st.size()){
                st.pop();
            }

            if(st.size()<k){
                st.push(nums[i]);
            }
        }


        for(int i=k-1;i>=0;i--){
            res[i]=st.pop();
        }

        return res;
    }
}
