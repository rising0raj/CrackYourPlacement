class Solution {
        class Number {
        int value;
        int index;
        int smaller;
        Number(int value,int index,int smaller){
            this.value = value;
            this.index = index;
            this.smaller = smaller;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        Number[] numbers = new Number[nums.length];
        for(int i=0;i<nums.length;i++)
            numbers[i] = new Number(nums[i],i,0);
        mergeSort(0,numbers.length-1,numbers);
        Arrays.sort(numbers,(n1,n2)->(n1.index-n2.index));
        List<Integer> res = new ArrayList<>();
        for(Number number:numbers)
            res.add(number.smaller);
        return res;
    }
    
    Number[] mergeSort(int l,int r,Number[] numbers){
        if(l==r)
            return new Number[]{numbers[l]};
        int m = (l+r)/2;
        Number[] left = mergeSort(l,m,numbers);
        Number[] right = mergeSort(m+1,r,numbers);
        return merge(left,right);
    }
    
    Number[] merge(Number[] left,Number[] right){
        int length = left.length + right.length;
        Number[] res = new Number[length];
        int l=0,r=0,i=0;
        while(i<length){
            if(l<left.length && r<right.length){
                if(left[l].value<=right[r].value){
                    left[l].smaller += r;
                    res[i++] = left[l++];
                }else
                    res[i++] = right[r++];
            }else if(l<left.length){
                left[l].smaller += r;
                res[i++] = left[l++];
            }else{
                res[i++] = right[r++];
            }
        }
        return res;
    }
}
