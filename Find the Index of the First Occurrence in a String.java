class Solution{
    public int strStr(String str, String sub){
        int n1 = str.length();
        int n2 = sub.length();
        for (int i = 0; i <= n1 - n2; i++){
            if (str.substring(i, i + n2).equals(sub)){
                return i;
            }
        }
        return -1;
    }
}
