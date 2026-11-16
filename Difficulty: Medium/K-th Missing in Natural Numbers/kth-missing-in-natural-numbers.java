class Solution {
    public int findKthSmall(int[] arr, int k) {
        int n =arr.length;
        
        
        Arrays.sort(arr);
        int rem=k;
        
        int prev=arr[0];
        
       
       if(k<prev){
           
           return k;
       }
       
       
       
       
        rem-=Math.max(0,
        prev-1); 
        
        
        for(int i=1;i<n;i++){
            int curr=arr[i];
            
            int gap=Math.max(0,
            curr-prev-1);
            
            
            if(gap>=rem){
                
                return prev+rem;
            }else{
                rem-=gap;
            }
            
            
            prev=curr;
        }
        
        
        return prev+rem;
    }
}