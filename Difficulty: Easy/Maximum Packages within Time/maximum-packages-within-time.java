class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        int length=arr.length;
        totalTime=Math.min(totalTime,length);
        
        int currWindowSum=0;
        for(int i=0;i<totalTime;i++){
            
            currWindowSum+=arr[i];
        }
        
        
        int maxPackages=currWindowSum;
        int k=totalTime;
        for(int i=totalTime;i<length;i++){
            
            currWindowSum=currWindowSum+arr[i]-arr[i-k];
            
            maxPackages=Math.max(maxPackages,currWindowSum);
        }
        
        
        
        
        
        return maxPackages;
    }
}