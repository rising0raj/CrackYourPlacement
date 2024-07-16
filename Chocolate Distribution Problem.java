class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
         long res = Long.MAX_VALUE;
        Collections.sort(a);
        for(int i =0; i<n-m+1; i++){
            int minele = a.get(i);
            int maxele = a.get(i+m-1);
            res = (long)Math.min(res, maxele-minele);
        }
        return res; 
    }
}
