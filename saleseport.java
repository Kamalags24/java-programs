
import java.util.*;
public class saleseport {
    public static int[] sales(int m,int a1[],int[] a2,int[] a3) {
        int[] b=new int[m];
       b[0]=l(a1);
       b[1]=l(a2);
       b[2]=l(a3);

        return b;
    }
    public static int  l(int[] n) {
     Arrays.sort(n);
     return n[n.length-1];
     
        
    }
    public static void main(String[] args) {
        int [] a1={333,54,784,954},a2={965,784,8524,6514},a3={856,8475,26,944},k=sales(3, a1, a2, a3);
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
        }
    }
}
