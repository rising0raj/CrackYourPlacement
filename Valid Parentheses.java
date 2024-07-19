class Solution {
    public boolean isValid(String s) {
        char[]  ch = s.toCharArray();
        Stack<Character> stack = new Stack<>(); 
        
       for(char c : ch){
           if(c =='(' || c=='[' || c=='{'){
               stack.push(c);
           }
           else if (!stack.empty()) {
               
              if(c ==']' && stack.peek() != '[') return false;
              else if(c =='}' && stack.peek() != '{') return false;
              else if(c ==')' && stack.peek() != '(') return false;
              else stack.pop();
           }
           else {
               return false;
           }
       }
        return stack.empty();
    }
}
