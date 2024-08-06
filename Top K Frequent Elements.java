class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        Arrays.sort(nums);

        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }

        int res[]=new int[k];
        List<Integer>list=new ArrayList<>(m.keySet());
        list.sort((a, b) -> m.get(b) - m.get(a));

        for(int i=0;i<k;i++){
            res[i]=list.get(i);
        }

        return res;

        
    }
}
