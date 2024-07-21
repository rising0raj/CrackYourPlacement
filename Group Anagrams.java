class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> res= new ArrayList<>();
        // Map<String, List<String>> map=new HashMap<>();

        // for(String s:strs){
        //     char ch[] = s.toCharArray();
        //     Arrays.sort(ch);
        //     String s2=new String(ch);
        //     if(map.containsKey(s2)==false)
        //         map.put(s2,new ArrayList<>());
        //     map.get(s2).add(s);
        // }

        // res.addAll(map.values());

        //  return res;



        List<List<String>> res=new ArrayList<>();
        Map<String,List<String>> se=new HashMap();

        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String s2=new String(ch);
            if(se.containsKey(s2)==false){
                se.put(s2,new ArrayList<>());
            }
            se.get(s2).add(s);
        }

        res.addAll(se.values());
        return res;
    }
}
