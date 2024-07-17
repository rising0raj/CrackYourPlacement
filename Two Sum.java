class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2],n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<n;i++){
            if(target==nums[i] && map.containsKey(0)){
                res[0]=i;
                res[1]=map.get(0);
                break;
            }else if(map.containsKey(target-nums[i])){
                if(map.get(target-nums[i])>i){
                    res[0]=i;
                    res[1]=map.get(target-nums[i]);
                    break;
                }
            }
        }

        return res;
    }
}
