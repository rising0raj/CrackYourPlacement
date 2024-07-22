class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        String ans="";
        int i=0,al=a.length(),bl=b.length();
        while(i<al || i<bl || carry != 0){
            int x=0;
            if(i<al && a.charAt(al-i-1)=='1')
                x=1;
            int y=0;
            if(i<bl && b.charAt(bl-i-1)=='1')
                y=1;
            
            ans=(x+y+carry)%2+ans;
            carry=(x+y+carry)/2;
            i++;
        }
        return ans;
    }
}
