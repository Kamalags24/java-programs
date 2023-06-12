public class strongnum {
   public static void main(String[] args) {
       int l=0,n=145,f=1,s=0;
      System.out.println(fact(4));
      while(n!=0){
          l=n%10;
          s+=fact(l);
n/=10;
      }
System.out.println(s);
    }
    public static int fact(int n){

    if(n==0){return 1;}
    else return n*fact(n-1);
        
    }
}
