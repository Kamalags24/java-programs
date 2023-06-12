public class permutation {
   

   // private static final int i = 0;
  public static void main(String[] args) {
      int n=5,p=9;
  System.out.println(fact(n)/fact(n-p));
  }
    public static int fact(int n) {
        int  j=1;
        for(int i=1;i<=n;i++){        
           j=j*i;//return j;


        }
        return j;
        
    }
}
