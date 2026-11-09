class Solution {
    int getCount(String s, int k) {
     int[] map=new int[26];
     
     
     
     
     char prev=s.charAt(0);
     for(int i=1;i<s.length();i++){
         char curr=s.charAt(i);
         
         if(curr==prev){
             continue;
         }
         
         
         
         map[prev-'a']++;
         prev=curr;
         
     }
     
     map[prev-'a']++;
     int count=0;
     
     for(int i:map){
         
         if(i==k){
             count++;
         }
     }
     
     
    //  System.out.println(Arrays.toString(map));
     
     
     
     return count;
    }
}