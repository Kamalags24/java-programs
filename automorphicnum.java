public class automorphicnum {
    public static int isauto(int n) {
        int s=n*n;
        while(n>0)
        {
            if(n%10!=s%10){return 0;}
            n/=10;s/=10;
        }
        return 1;
    }
    public static void main(String args[]) {
       if(isauto(4)==1){ System.out.println("true");}
       else{System.out.println("not true");}
        
    }
}
