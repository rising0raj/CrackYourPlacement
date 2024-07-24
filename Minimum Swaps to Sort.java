
class Solution
{
    public void swap(int[] arr, int x, int y)
    {
        int t= arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }
    public int minSwaps(int nums[])
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       
       for(int i=0;i<nums.length;i++){
           map.put(nums[i],i);
       }
       
       Arrays.sort(nums);
       
       int res=0;
       
       for(int i=0;i<nums.length;i++){
           if(i==map.get(nums[i])){
               continue;
           }else{
               res++;
               swap(nums,i,map.get(nums[i]));
               i--;
               
           }
       }
       
       return res;
    }
}
