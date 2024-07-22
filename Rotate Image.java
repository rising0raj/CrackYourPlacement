class Solution {
    static void reverseArray(int [] arr)
        {
            int i=0;int j= arr.length-1;
            while (i<j)
            {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
                j--;
            }
        }
    public void rotate(int[][] old) {
        int temp=0;
        for(int i=0;i<old.length-1;i++){
            for(int j=i+1;j<old.length;j++){
                temp=old[i][j];
                old[i][j]=old[j][i];
                old[j][i]=temp;
            }
        }
        for(int i=0;i<old.length;i++){
            reverseArray(old[i]);
        }
    }
}
