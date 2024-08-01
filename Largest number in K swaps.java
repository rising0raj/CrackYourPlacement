class Solution
{   
     public static String get(char[] arr, int k,int count){
        if(count==0 || k==arr.length){
            return new String(arr);
        }
        String temp=new String(arr);
        int i=k+1;
        for(;i<arr.length;i++){
            if(arr[k]>=arr[i]) continue;
            swap(arr,i,k);
            temp=max(temp,get(arr,k+1,count-1));
            swap(arr,i,k);
        }
        if(i==arr.length && k<i){
            temp=max(temp,get(arr,k+1,count));
        }
        return temp;
    }
    public static String max(String s1,String s2){
        return s1.compareTo(s2)>0?s1:s2;
    }
    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Function to find the largest number after k swaps.
    public static String findMaximumNum(String str, int k)
        {
            return get(str.toCharArray(),0,k);
        }
}
