public class spdis {
    public static int discount(int k,int[] n) {
        int c=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>0 && k%n[i]==0){
                c++;
            }
        }
        return c;
        
    }
    public static void main(String[] args) {
        int n[]={9,-3,8,-7,-8,18,10};
        System.out.println(discount(18, n));
    }
}
