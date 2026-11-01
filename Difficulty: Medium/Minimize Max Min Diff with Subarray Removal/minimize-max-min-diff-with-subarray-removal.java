class Solution {
    public int minDiff(int k, int[] arr) {
        int length = arr.length;
        
        int[][] forward=new int[length][2];
        int[][] backward=new int[length][2];
        
        
        int minF=Integer.MAX_VALUE;
        int maxF=Integer.MIN_VALUE;
        
        int minB=minF;
        int maxB=maxF;
        
        
        for(int i=0;i<length;i++){
            minF=Math.min(minF,arr[i]);
            maxF=Math.max(maxF,arr[i]);
            
            minB=Math.min(minB,arr[length-i-1]);
            maxB=Math.max(maxB,arr[length-i-1]);
            
            forward[i][0]=minF;
            forward[i][1]=maxF;
            
            backward[length-i-1][0]=minB;
            backward[length-i-1][1]=maxB;
           }
           
           
          int res=backward[k][1]-backward[k][0];
          
          
          for(int i=1;i<length-k;i++){
              int min=Math.min(forward[i-1][0],backward[i+k][0]);
              int max=Math.max(forward[i-1][1],backward[i+k][1]);
              
              res=Math.min(max-min,res);
          }
          
          
          int tail=forward[length-k-1][1]-forward[length-k-1][0];
          
          res=Math.min(res,tail);
           
           
           
        
        
        
        
        
        return res;
    }
}