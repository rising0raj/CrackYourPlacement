class Solution {
    public int[] restoreArray(int[][] nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();

        for(int i[]:nums){
            map.putIfAbsent(i[0],new ArrayList<>());
            map.putIfAbsent(i[1],new ArrayList<>());

            map.get(i[0]).add(i[1]);
            map.get(i[1]).add(i[0]);

        }

        int res[]=new int[nums.length+1];

        for(var entry:map.entrySet()){
            if(entry.getValue().size()==1){
                res[0]=entry.getKey();
                res[1]=entry.getValue().get(0);
                break;
            }
        }

        for(int i=2;i<res.length;i++){
            var temp=map.get(res[i-1]);
            res[i]=temp.get(0)==res[i-2]?temp.get(1):temp.get(0);
        }

        return res;
    }
}
