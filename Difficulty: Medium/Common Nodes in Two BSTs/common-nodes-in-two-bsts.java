/* Structure of a Binary Search Tree node
class Node {
  public int data;
  public Node left;
  public Node right;

  public Node(int val) {
      data = val;
      left = right = null;
  }
};
*/

class Solution {
    
    
    public void pushNode(Node curr,Stack<Node> tree){
        if(curr==null){
            return ;
        }
        
        // inOrder traversal - partial
        
        if(curr.left!=null){
            tree.push(curr);
            pushNode(curr.left,tree);
           
        }else{
            pushNode(curr.right,tree);
            tree.push(curr);
        }
        
        
    }
    
    
    
    public void popNode(Stack<Node> tree){
        Node curr=tree.pop();
        
        if(curr.left!=null && curr.right!=null){
            pushNode(curr.right,tree);
        }
        
        
    }
    
    
    
    
    
    
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
       Stack<Node> tree1=new Stack<>();
       Stack<Node> tree2=new Stack<>();
       
       
       ArrayList<Integer> res=new ArrayList<>();
       
        
        pushNode(r1,tree1);
        pushNode(r2,tree2);
        
        
        
      while(!tree1.isEmpty() && !tree2.isEmpty()){
          Node curr1=tree1.peek();
          Node curr2=tree2.peek();
            
            if(curr1.data==curr2.data){
              popNode(tree1);
              popNode(tree2);
              res.add(curr1.data);
                
            }else if(curr1.data<curr2.data){
              popNode(tree1);
            }else{
                popNode(tree2);
            }     
           
          
           
      }
       
        
        return res;
    }
}