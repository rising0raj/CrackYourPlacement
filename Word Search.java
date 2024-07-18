class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && helper(board,i,j,word,0))
                    return true;
            }
        }
        return false;
    }


    private boolean helper(char[][] board, int i, int j,String word, int len){
        if(len==word.length()){
            return true;
        }
        if(i==-1 || i==board.length || j==-1 || j==board[i].length || board[i][j] !=word.charAt(len)){
            return false;
        }
        char temp= board[i][j];
        board[i][j]='*';
        boolean found=helper(board,i+1,j,word,len+1)||
                      helper(board,i-1,j,word,len+1)||
                      helper(board,i,j+1,word,len+1)||
                      helper(board,i,j-1,word,len+1);
        
        board[i][j]=temp;
        return found;
    }
}
