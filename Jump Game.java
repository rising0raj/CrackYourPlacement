class Solution {
    public boolean canJump(int[] nums) {
        int c=0;
        for(int i=nums.length -2 ;i>=0 ; i--){
            if(c>=nums[i]){
                c++;
            }
            else{
                c=0;
            }
        }
        return c==0;
    }
}
