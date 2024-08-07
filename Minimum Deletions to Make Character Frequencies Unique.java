class Solution {
    public int minDeletions(String s) {
        int ch[]=new int[26];
        for(char c:s.toCharArray()){
            ch[c-'a']++;
        }
        int del=0;
        HashSet<Integer> set= new HashSet<>();
        for(int i=25;i>=0;i--){
            if(ch[i]==0)
            continue;
            while(set.contains(ch[i])){
                ch[i]--;
                del++;
            }
            if(ch[i]==0)
            continue;
            set.add(ch[i]);
        }
        return del;
        
    }
}
