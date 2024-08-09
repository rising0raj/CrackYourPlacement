class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []count=new int[26];

        for(char ch:tasks){
            count[ch-'A']++;
        }

        Arrays.sort(count);

        int max=count[25];

        int idle=(max-1)*n;

        for(int i=24;i>=0;i--){
            idle-=Math.min(max-1,count[i]);
        }

        return tasks.length+Math.max(idle,0);
    }
}
