public class square {
    public static int sqcount(int[] n) {
       int c=0;
        for(int i=0;i<n.length;i++){
            if(n[i]==sq(n[i])){
                c++;

            }
        }
        return c;
        
    }
    public static int sq(int n) {
        int m=(int )Math.sqrt(n);
        return m*m;


        
    }
    public static void main(String[] args) {
       int[] i={77,81,79,49,64};
       System.out.println( sqcount(i));
    }
    
}
