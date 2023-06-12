public class isfib {
    public static int fib(int n) {
        if(n==0){return 0;}
        if(n==1){return 1;}
        else{
            return fib(n-1)+fib(n-2);
        }
        
    }
    public static boolean perfect(int n) {
        int c=(int)Math.sqrt(n);
        return (c*c==n);

        
    }
    public static boolean isFib(int n) {
        return perfect(5*n*n+4 )|| perfect(5*n*n-4);
        
    }
    public static void main(String[] args) {
        System.out.println(fib(3));
        System.out.println(perfect(4));
        System.out.println(isFib(3));


    }
    
}
