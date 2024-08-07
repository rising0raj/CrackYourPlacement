class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int k=intervals[0][1];
        int count=0;
        for(int j=1;j<intervals.length;j++){
            if(intervals[j][0]<k){
                count++;
            }
            else{
                k=intervals[j][1];
            }
        }
        return count;
    }
}
