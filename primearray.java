import java.util.*;
public class primearray{
    public static void main(String[] args) {
       int i[]={41,31,43,29,59,67};
        System.out.println(primes(i));
    }
    public static int primes(int[] n) {
       int k=0,s=0,q=count(n);
        int[] a=new int[q];
        for(int i=0;i<n.length;i++){
            if(prime(n[i])){
                a[k]=n[i];
                k++;
                s+=n[i];
            }
            

        }
        Arrays.sort(a);
        return (s-a[q-1]);
        
    }
    public static boolean prime(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }

        }
        if(c==2){
            return true;
        }
        else 
        return false;
        
    }
    public static int count(int[] n){
        int k=0;
        for(int i=0;i<n.length;i++){
            if(prime(n[i])){
                k++;
            }
        }
        return k;
    }
}