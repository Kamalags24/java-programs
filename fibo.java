public class fibo {
    public static int fi(int n) {
        
        if(n==1){
            return 1;

        }
        if(n==2){
            return 1;
        }
        return fi(n-1)+fi(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fi(8));
    }
}
