import javax.swing.event.SwingPropertyChangeSupport;

public class transmit {
    public static long dats(long n) {
        long h=0;

        while(n!=0){
            long m=n%10;
            h=h*10+m;
            n/=10;


        }
        return h;
        
    }
    public static void main(String[] args) {
        System.out.println(dats(123456789));
    }
}
