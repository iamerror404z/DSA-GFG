class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        
        int n=start.length;
        
        int req=1;
        
        int rooms=1;
        int prev=0;
        
        for(int i=1;i<n;i++){
            
            int currStart=start[i];
            
            
            while(prev<n && end[prev]<=currStart){
                prev++;
            }
            
            int currReq=i-prev+1;

            
            req=Math.max(req,currReq);
            
        }
        
        
        return req;
    }
}
