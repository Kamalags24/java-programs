import java.util.*;
public class bintodec {
    public static void main(String[] args) {
        int n=0,r=0,d=0;
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        while(b>0){
            r=b%10;
            d+=(int) (r*Math.pow(2 , n));//2 for 8 is octal to  decimal
            n++;
            b/=10;
     
    }
    System.out.println(d);
    
}
}