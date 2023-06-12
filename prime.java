public class prime {
     public static void main(String[] args) {
        System.out.println(isprime(10));



     }
    public static boolean isprime(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){c++;}
        }
if(c==2){return true;}
else{return false;}
        
    }}