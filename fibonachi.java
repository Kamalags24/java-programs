public class fibonachi{
    public static void main(String args[]){
        int num=3;
       System.out.println(fib(num));
       fibn(7);
       se(4);
    }
    public static int fib(int n) {
      // int k;
        if(n==0){return 0;}
        if(n==1){return 1;}
       else
           {return  fib(n-1)+fib(n-2);}
       
    
}
public static void se(int n) {
    int a=0,b=1,s;
    System.out.print(a+" "+b+" ");
    for (int i=2;i<n;i++){
        s=fib(i);
        System.out.print(s+" ");
    }
    
}
public static void fibn(int n1) {
    int a=0,b=1,d;
    System.out.print(a+" "+b+" ");
    for (int i=2;i<=n1;i++){
d=a+b;
a=b;
b=d;
    System.out.print(d+" ");}
    System.out.println();
    
}}