class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0,sum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();

        mp.put(0,1);

        for(int i:nums){
            sum+=i;
            int rem=sum-k;
            if(mp.containsKey(rem)){
                ans+=mp.get(rem);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }

        return ans;
    }
}
