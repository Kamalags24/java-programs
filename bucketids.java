import java.util.*;
public class bucketids {
    public static int bucket(int n) {
        int a=n;
        String s=String.valueOf(a);

        int[] l=new int[s.length()];
int i=0;
        while(n!=0){
            int m=n%10;
            l[i]=m;
            n/=10;
            i++;

        }
        Arrays.sort(l);
        return l[s.length()-1];

        
    }
    public static void main(String[] args) {
        System.out.println(bucket(123456789));
    }
}
