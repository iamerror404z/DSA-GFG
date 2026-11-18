class Solution {
    
    
    public int pattern(int n){
        
        if(n%4==1){
            return 1;
        }else if(n%4==2){
            return n+1;
        }else if(n%4==3){
            return 0;
        }
        
        
        return n;
    }
    
    
    public int findXOR(int l, int r) {
        
        
        // System.out.println();
        return pattern(l-1)^pattern(r);
    }
}