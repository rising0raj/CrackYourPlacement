
class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        
        if(s.length()<p.length() || p==""){
            return "-1";
        }
        if(s.length()==p.length()){
            return s;
        }
        
        Map<Character,Integer> sp=new HashMap<>();
        Map<Character,Integer> pp=new HashMap<>();
        
        
        for(int i=0;i<p.length();i++){
            pp.put(p.charAt(i),pp.getOrDefault(p.charAt(i),0)+1);
        }
        
        int curr=0,len=pp.size(),l=0,r=0;
        String res="-1";
        int reslen=Integer.MAX_VALUE;
        
        while(r<s.length()){
            
            char c=s.charAt(r);
            
            sp.put(c,sp.getOrDefault(c,0)+1);
            
            if(pp.containsKey(c) && sp.get(c) == pp.get(c)){
                curr++;
            }
            
            while(curr==len){
                if(r-l+1<reslen){
                    res=s.substring(l,r+1);
                    reslen= r-l+1;
                }
                char t=s.charAt(l);
                
                sp.put(t,sp.get(t)-1);
                
                if(pp.containsKey(t) && sp.get(t)<pp.get(t)){
                    curr--;
                }
                l++;
            }
            r++;
        }
        
        return reslen == Integer.MAX_VALUE? "-1" : res;
        
        
        
        
        
    }
}
