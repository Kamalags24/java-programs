public class findpin {
    public static void main(String[] args) {
        System.out.println(sum(3521,2452,1352,38));
        System.out.println(sum(3521,2452,1352,37));
    }
    public static int sum(int i1,int i2,int i3,int i4) {
    int n=0,m=0;
 if(i4%2==0){
         n=even(i1)+even(i2)+even(i3);
         return n;
     }
    else {
         m=odd(i1)+odd(i2)+odd(i3);
        return m; 
     }
        
    }
    public static int  even(int i){
        int n=0;
        while(i!=0){
            int m=i%10;
            if(m%2==0){
                n+=m;
            }
            i/=10;
        }
        return n;
    }
    public static int  odd(int i){
        int n=0;
        while(i!=0){
            int m=i%10;
            if(m%2!=0){
                n+=m;
            }
            i/=10;
        }
        return n;
    }
}
