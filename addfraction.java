import javax.rmi.ssl.SslRMIClientSocketFactory;

public class addfraction {
    public static int hcf(int a, int b) {
        int h=0;
        for(int i=1;i<=a ||i<=b;i++){
           if(a%i==0 && b%i==0){ h=i;}

        }
        return h;
    }
    public static void main(String[] args) {
        int n1=1,r1=2,n2=1,r2=8;
        int j=(n1*r2)+(n2*r1);
        int k=r1*r2;
        int g=j/k;
        int i=hcf(j, k);
        if(j==k){System.out.println("1");}
        else{System.out.println(j/i+"/"+k/i);}
    }
}
