class Solution {
    public int smallestSubWithSum(int[] arr, int x) {
        int n = arr.length;
        int res=n+1;
        
        int windowSum=0;
        
        int ptr=0;
        
        int tar=x+1;
        
        for(int i=0;i<n;i++){
            int curr=arr[i];
            
            windowSum+=curr;
            
            
            while(ptr<=i && windowSum>=tar){
                windowSum-=arr[ptr];
                ptr++;
            }
            
            
            if(ptr-1>=0){
                ptr--;
                windowSum+=arr[ptr];
                
            }
        
        
            if(windowSum>=tar){
                int windowLen=i-ptr+1;
                // System.out.println(i+" : "+ptr+" : "+windowSum+" : "+windowLen);
                
                res=Math.min(res,windowLen);
            }
            
            
        }
        
        if(res==n+1){
            return 0;
        }
        
        
        
        return res;
    }
}