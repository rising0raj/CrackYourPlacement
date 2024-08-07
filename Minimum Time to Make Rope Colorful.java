class Solution {
    public int minCost(String s, int[] cost) {
        int prev = 0;
        int res = 0;
        char arr[] = s.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[prev] != arr[i])
               prev = i;
            
            else {
                if (cost[prev] < cost[i]) {
                    res += cost[prev];
                    prev = i;
                }
                
                else {
                    res += cost[i];
                }
            }
        }
        return res;
    }
}
