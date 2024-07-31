class Solution {
    public int countArrangement(int n) {
        int nums[]=new int[n+1];

        for(int i=1;i<=n;i++){
            nums[i]=i;
        }

        return recur(nums,1);
    }

    private int recur(int nums[],int index){
        if(index==nums.length){
            return 1;
        }

        int ans=0;

        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            if(nums[index]%index==0 || index%nums[index]==0){
                ans+=recur(nums,index+1);
            }
            swap(nums,index,i);
        }
        return ans;
    }

    private void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
