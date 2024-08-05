class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int check[]= new int[gas.length];
        int sum=0;
        for(int i=0;i<check.length;i++){
            check[i]=gas[i]-cost[i];
            sum+=check[i];
        }
        if(sum<0){
            return -1;
        }
        int ans=0;
        int right=0;
        int total =0;
        while(right<check.length){
            total+=check[right];

            if(total<0){
                total=0;
               ans= right+1;
            }
            right++;
            
            
        }
      return ans;
    }
}
