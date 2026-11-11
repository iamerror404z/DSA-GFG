class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            
            if(map.containsKey(curr) && Math.abs(map.get(curr)-i)<=k){
                
                return true;
            }
            
            
            
            map.put(arr[i],i);
        }
            
            return false;
        
    }
}