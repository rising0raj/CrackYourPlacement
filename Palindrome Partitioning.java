class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(s,0,new ArrayList<>(), ans);
        return ans;
    }

    public void helper(String s, int ind, List<String>temp, List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(ispalidrome(s,ind,i)){
                temp.add(s.substring(ind, i+1));
                helper(s,i+1,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }

    public boolean ispalidrome(String s, int i, int j ){
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
}
