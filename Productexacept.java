public class Productexacept {

    public  static int[] ProEx(int[] a) {
        int[] b=new int[a.length];
        int d=1;
        for(int i=0;i<a.length;i++){
          for(int j=0;j<a.length;j++){
            if(j==i){
                continue;
            }
            else{
            d*=a[j];}

          }
          
          b[i]=d;
          d=1;
        }
        
       return b;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
      // System.out.println(ProEx(a));
     //  ProEx(a);
     int[] b=ProEx(a);
     System.out.println(b.length);
     for(int i=0;i<b.length;i++){
        System.out.println(b[i]);
     }
    }
}
