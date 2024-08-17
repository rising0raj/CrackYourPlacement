class Coordinates{
    int x;
    int y;
    int dis;
    Coordinates(int x,int y,int dis){
        this.x=x;
        this.y=y;
        this.dis=dis;
    }
}
class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int knight[], int target[], int n)
    {
         boolean visited[][]=new boolean[n+1][n+1];
        
        int dx[]={-2,-2,-1,-1,1,1,2,2};
        int dy[]={-1,1,-2,2,-2,2,-1,1};
        
        Queue<Coordinates> q= new LinkedList<>();
        q.add(new Coordinates(knight[0],knight[1],0));
        
        while(!q.isEmpty()){
            
            Coordinates curr=q.remove();
            
            if(curr.x==target[0]&&curr.y==target[1])
                return curr.dis;
                
            for(int i=0;i<8;i++){
                
                int x=curr.x+dx[i];
                int y=curr.y+dy[i];
                
                if(isValid(x,y,n)&&!visited[x][y]){
                    visited[x][y]=true;
                    q.add(new Coordinates(x,y,curr.dis+1));
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    
    public boolean isValid(int x,int y,int n){
        
        if( x>=1 && x<=n && y>=1 && y<=n)
            return true;
        return false;
    }
}
