class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1 || strs[0].length() ==0) 
          return strs[0];
        int n=0,i=0;
        while(n<strs[0].length()){
          char ch=strs[0].charAt(n);
          for(i=1;i<strs.length;i++){
            if(strs[i].length() <= n || strs[i].charAt(n) != ch)
              return strs[0].substring(0,n);
          }
          n++;
        }
        return strs[0].substring(0,n);
    }
}
