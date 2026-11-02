class Solution {
    
    public int processSum(int start,int end,
    Stack<Integer> stack,int[][] isVisited){
        int sum=0;
        // System.out.println("start is :"+start);
        // System.out.println("end is : "+end);
        // System.out.println("stack is : "+stack);
        
        while(!stack.isEmpty() && stack.peek()!=start){
            int curr=stack.pop();
            
            isVisited[curr][0]=2;
            sum+=curr;
            
        }
        
        stack.pop();
        isVisited[start][0]=2;
        
        
        return sum+start;
    }
    
    public int cyclePathSum(int index,int[] edge,int[][] isVisited){
        Stack<Integer> stack=new Stack<>();
        
        int start=-1;
        int end=-1;
        boolean hasCycle=false;
        
        int curr=index;
        while(!hasCycle){
            if(curr==-1 || isVisited[curr][0]==2){
                
                break;
            }
            
            isVisited[curr][0]=1;
            int next=edge[curr];
            stack.push(curr);
            
            
            if(next!=-1 && isVisited[next][0]==1){
                start=next;
                end=curr;
                hasCycle=true;
                
                
                
                break;
            }
            
            curr=next;
        }
        
        int sum=-1;
        
        if(hasCycle){
            
            sum=processSum(start,end,stack,isVisited);
        }
        
        while(!stack.isEmpty()){
            curr=stack.pop();
            
            isVisited[curr][0]=2;
        }
        
        
        
        
        return sum; 
        
    }
    
    
    public int largestSumCycle(int[] edge) {
        int length=edge.length;
        
        int[][] isVisited=new int[length][1];
        // 0 -> means not processed 
        // 1-> on current queue 
        // 2-?permanentely processed
        int res =-1;
        
        for(int i=0;i<length;i++){
            int source=i;
            int dest=edge[i];
            
            if(isVisited[i][0]!=0){
                continue;
            }
            
            int pathSum=cyclePathSum(i,edge,isVisited);
            res=Math.max(res,pathSum);
            
        }
        
        
        
        return res;
    }
}