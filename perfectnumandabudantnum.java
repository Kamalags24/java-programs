public class perfectnumandabudantnum {
    public static int factor(int num) {
      int c=0;
        for(int i=1;i<=num/2;i++)
{
    if(num%i==0){
        //System.out.print(i+" ");    
        c+=i;
    }
   
}        return c;
    }
    public static void main(String args[]) {
       System.out.println(abudant(4));
        System.out.println(factor(140));
System.out.println(friendly(30, 140));
    }
    public static boolean abudant(int n) {
        if(factor(n)>=n){return true;}
        return false;
        
    }
    public static boolean friendly(int n1,int n2) {
        int s1=factor(n1),s2=factor(n2);
        if((s1/n1)==(s2/n2)){return true;}
        return false;
        
    }
}
