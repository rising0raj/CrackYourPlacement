class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        HashSet<ArrayList<Integer>> lis = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        perm(arr,0,n,lis,ans);
        
        Collections.sort(ans,(a,b)->{
            int s = a.size();
            for(int i=0;i<s;i++){
                if(a.get(i)!=b.get(i))
                    return Integer.compare(a.get(i),b.get(i));
            }
            return Integer.compare(a.get(0),b.get(0));
        });
        return ans;
    }
    
    static void perm(ArrayList<Integer> arr,int i,int n,HashSet<ArrayList<Integer>> lis,ArrayList<ArrayList<Integer>> ans){
        if(i==n){
           if(lis.contains(arr))
                return ;
           lis.add(new ArrayList(arr)); 
           ans.add(new ArrayList(arr));
        }
        for(int j=i;j<n;j++){
            swap(arr,i,j);
            perm(arr,i+1,n,lis,ans);
            swap(arr,i,j);
        }
    }
    
    static void swap(ArrayList<Integer> arr,int i,int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
};
