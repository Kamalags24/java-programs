public class primeornot  {
    public static void checkp(int n) {
        int c=0;
        if (n<2){System.out.println("not a prime num");}
        
        for (int i=1;i<=n;i++)
        {
            if(n%i==0){c++;}

        }
         if(c>2){System.out.println("not prime num");}
         else{System.out.println("is prime");}
    }
    public static void main(String args[]) {
        checkp(2);
        
    }
    
}
