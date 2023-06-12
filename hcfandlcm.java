public class hcfandlcm{
    public static int HCF(int n1,int n2) {
        int h=0;
        for (int i=1;i<=n1||i<=n2;i++){
            if(n1%i==0 && n2%i==0){h=i;}
        }
        return h;
    }

    public static int  LCM(int n1,int n2) {
        int h=HCF(n1, n2);
        int u=(n1*n2);
        int l=u/h;
        return l;
        
    }
    public static void main(String[] args) {
        int n1=36,n2=60;
        System.out.println(HCF(n1, n2));
        System.out.println(LCM(n1, n2));
    }
}