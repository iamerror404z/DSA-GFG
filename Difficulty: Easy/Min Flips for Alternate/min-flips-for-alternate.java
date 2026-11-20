class Solution {
    public int minFlips(String s) {
        
        int n  = s.length();
        
        
        int prev1=s.charAt(0)-'0';
        int change1=0;
        
        
        int prev2=prev1^1;
        int change2=1;
        
        
        for(int i=1;i<n;i++){
            int curr = s.charAt(i)-'0';
            
            if(curr==prev1){
                
                prev1=curr^1;
                change1++;
            }else{
                
                prev1=curr;
            }
            
            
            if(curr==prev2){
                prev2=curr^1;
                change2++;
            }else{
                prev2=curr;
            }
            
            
            
        }
        
        
        
        return Math.min(change1,change2);
    }
}