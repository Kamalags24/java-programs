public class combination {
    public static int fact(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fact(2));
        System.out.println(ncr(5,2));

    }
    public static int ncr(int n,int r) {
        int c=fact(n)/(fact(n-r)*fact(r));
        return c;
        
   }
}
