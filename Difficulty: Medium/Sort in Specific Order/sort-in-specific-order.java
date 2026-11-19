class Solution {
    public void sortIt(int[] arr) {
        
        
        int  n =arr.length;
        Integer[] copy=new Integer[n];
        
        for(int i=0;i<n;i++){
            copy[i]=arr[i];
        }
        
        
        
        Arrays.sort(copy,new MyComp());
        
        
        for(int i=0;i<n;i++){
            arr[i]=copy[i];
        }
        
        // arr[0]++;
        
        // System.out.println(Arrays.toString(copy));
        
    }
}


class MyComp implements Comparator<Integer>{
    
    @Override
    public int compare(Integer a,Integer b){
        
        if(a%2==1 && b%2==1){
            
            return b-a;
        }else if(a%2==1){
            
            return -1;
        }else if(b%2==1){
            
            return 1;
        }
        
        
        return a-b;
    }
    
}