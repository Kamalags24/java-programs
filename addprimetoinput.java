public class addprimetoinput {
    public static int  prime(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){c++;}
        }
        if(c==2){
            return 1;
        }
        else{return 0;}
    }
    public static void main(String[] args) {
        System.out.println(prime(1));
        int n=14,x=0;
        for(int i=1;i<=n/2;i++){
            if(prime(i)==1){
                if(prime(n-i)==1){System.out.println(n+"="+i+"+"+(n-i));
            x=1;}
            }
        }
        if(x==0){System.out.println("no possibilities");}
    }

}
