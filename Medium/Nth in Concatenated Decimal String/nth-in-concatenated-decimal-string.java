class Solution {
    
    public char nthDigit(long pos,long num){
        int count=0;
        
        
        while(count!=pos){
            
            num/=10;
            count++;
        }
        
        
        
        return (char)(((int)('0'))+(num%10));
    }
    
    
    
    
    public char nthCharacter(int n) {
        long start=1;
        long end=10;
        
        long startLen=0;
        long endLen=0;
        
        
        long len=0;
        long digits=1;
        
        while(startLen<n){
            long currLen=(end-start)*digits;
            
            startLen=len+1;
            endLen=currLen+len;
            len+=currLen;
            
            
            if(len>=n){
                break;
                
            }
                
            
            
            start=end;
            end=end*10;
            digits++;
            
           
        }
        
        long diff=(n-startLen)/digits;
        
        long num =start+diff;
        
        long pos = digits-1-(n-startLen)%digits;
        
        // System.out.println("diff is : "+diff);
        // System.out.println("num is : "+num);
        
        // System.out.println("startLen is :"+startLen);
        // System.out.println("endLen is : "+endLen);
        
        
        
        
        return nthDigit(pos,num);
    }
}