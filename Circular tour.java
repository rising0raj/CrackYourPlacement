class Solution
{
    
    int tour(int petrol[], int distance[])
    {
	int s=0;
        for(int i=0;i<petrol.length;i++){
            s+=(petrol[i] - distance[i]);
        }
        if(s<0)
            return -1;
    
        
        int index=0;
        int c=0;
        for(int i=0;i<petrol.length;i++){
            c+=(petrol[i] - distance[i]);
            if(c<0){
                c=0;
                index=i+1;
                
            }
            
        }	
        return index;
    }
}
