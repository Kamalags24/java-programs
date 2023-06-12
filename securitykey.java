import java.util.*;
public class securitykey {
    public static int  repeated(int n) {
int l=l(n);
      int[] a=new int[l];
      for(int p=0;p<l;p++){
        int m=n%10;
        a[p]=m;
        n/=10;
       // System.out.println(a[p]);
      }

        int[] k=new int[10];
        int i,c=0;
        for(i=0;i<a.length;i++){
            if(a[i]>0){
                k[a[i]]++;
            }
        }
        for(int j=0;j<k.length;j++){
            if(k[j]>1){
                c++;
                               

            }
            
        }
        if(c==0){
            return -1;
        }
        else
        return c;
    }
    public static int l(int n) {
        String s=String.valueOf(n);
        return s.length();
        
    }
    public static void main(String[] args) {
        int[] i={5,7,3,7,8,9,2,3};
     //  repeated(57378923);
       System.out.println(repeated(123456789));
    }
}
