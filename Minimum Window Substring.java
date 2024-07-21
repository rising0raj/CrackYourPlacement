class Solution {
    public String minWindow(String s, String p) {
        if(s.length()<p.length() || p==""){
            return "";
        }
        
        int map[]=new int[128],count=p.length(),start=0,end=0,minlen=Integer.MAX_VALUE,startIndex=0;

        for(char c:p.toCharArray()){
            map[c]++;
        }
        char ch[]=s.toCharArray();
        while(end<s.length()){
            if(map[ch[end++]]-->0){
                count--;
            }
            while(count==0){
                if(end-start<minlen){
                    startIndex=start;
                    minlen=end-start;
                }
                if(map[ch[start++]]++ == 0){
                    count++;
                }
            }
        }

        return minlen==Integer.MAX_VALUE ? new String() : new String(ch,startIndex,minlen);


    }
}
