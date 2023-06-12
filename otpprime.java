public class otpprime {
    public static int count(int n1,int n2){
        int c=0,k=0;
        for(int i=n1;i<=n2;i++){
            if(prime(i)){
                c++;
                //System.out.println(i);
            }

        }
        return c;
       //System.out.println(c);

    }
    public static boolean  prime(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){return true;}
        else return false;
    }
    public static int otp(int n1,int n2) {
        int c=count(n1, n2),k=0;
        int[] a=new int[c];
        for(int i=n1;i<=n2;i++){
            if(prime(i)){
                a[k]=i;
                k++;
            }
        }
        return a[0]+a[c-1];
       // System.out.println(a[0]);
        
    }
public static void main(String[] args) {
   // System.out.println(otp(97, 50));
   int n=15;
System.out.println(otp(n, 50));
}
}
