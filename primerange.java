public class primerange {
    public static int checkp(int n) {
        int c=0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){c++;}

        }
        if(c==2){return 1;}
        else return 0;
    }
    public static void main(String[] args) {
        int u=1,l=10;
        for(int i=1;i<=l;i++){
            if(checkp(i)==1){System.out.print(i+" ");}
        }
    }
}
