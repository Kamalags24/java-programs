public class discount {
    public static int disc(int n) {
        int o=0,e=0,i=0;
        String s=String.valueOf(n);
        int l=s.length();
        int[] a=new int[l];
        while(n!=0){
            int m=n%10;
            a[i]=m;
            i++;n/=10;

        }
        for(int j=0;j<l;j++){
            if(a[j]%2==0){
                e+=a[j];
            }
            else{
                o+=a[j];
            } 
              
        }
        return o*e;


        
    }
    public static void main(String[] args) {
        System.out.println(disc(2514795));
    }
}
