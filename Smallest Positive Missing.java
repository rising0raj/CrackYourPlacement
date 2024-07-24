class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Set<Integer> a=new HashSet<>();
        
        for(int i:arr){
            a.add(i);
        }
        int x=1;
        for(;;){
            if(!a.contains(x)){
                return x;
            }else{
                x++;
            }
        }
    }
}
