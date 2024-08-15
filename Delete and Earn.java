class Solution {
    public int deleteAndEarn(int[] nums) {
        int exc=0,inc=0;
        int nums2[]=new int[10001];

        for(int i:nums) nums2[i]++;

        for(int i=0;i<10001;i++){
            int ni=exc+i*nums2[i];
            int ne=Math.max(exc,inc);
            inc=ni;
            exc=ne;
        }
        return Math.max(exc,inc);
    }
}
