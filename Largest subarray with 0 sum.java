
class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> hm=new HashMap<>();
   int s=0,r=0;
   
   for(int i=0;i<n;i++){
       s+=arr[i];
       if(!hm.containsKey(s))hm.put(s,i);
       else{
           r=Math.max(r,i-hm.get(s));
       

   }
              if(s==0)r=Math.max(s,i+1);
   }
   return r;
    }
}
