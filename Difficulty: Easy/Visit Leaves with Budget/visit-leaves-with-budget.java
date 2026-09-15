/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    
    public void dfs(Node curr, int level,int[] map){
        if(curr==null){
            
            return ;
        }
        
        if(curr.left==null && curr.right==null){
            if(level<map.length){
                
                map[level]++;
            }
            
            
            return ;
        }
        
        dfs(curr.left,level+1,map);
        dfs(curr.right, level+1 , map);
        
        
    }
    
    
    public int getCount(Node root, int k) {
        int[] map = new int[k+1];
        
        dfs(root,1,map);
        
        int count=0;
        int rem=k;
        
        // System.out.println(Arrays.toString(map));
        
        for(int i=1;i<=k;i++){
            
            if(map[i]==0){
                
                continue;
            }
            
            int div=rem/i;
            int min=Math.min(div,map[i]);
            
            count+=min;
            rem-=(min*i);
            
            if(rem<i){
                break;
            }
            
            
        }
        
        
        return count;
    }
}