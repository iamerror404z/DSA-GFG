class Solution {
    public int subsequenceSum(String s) {
        
        long digitSum=0;
        
        int mod=1000000007;
        
        for(char d:s.toCharArray()){
            
            digitSum+=(d-'0');
        }
        
        digitSum=digitSum%mod;
        
        long digitF=1;
        
        for(int i=1;i<s.length();i++){
            digitF=(digitF*2)%mod;
            
        }
        
        
        return (int)((digitSum*digitF)%mod);
        
    }
}