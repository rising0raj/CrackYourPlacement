class Solution {
    public int findDuplicate(int[] nums) {
        int cal[]=new int[nums.length];
        int res=0;
        for(int c:nums){
            cal[c-1]++;
            if(cal[c-1]>1){
                res=c;
                break;
            }
        }
        
        return res;

    }
}
