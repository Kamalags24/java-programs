import javax.lang.model.util.ElementScanner14;

public class factor{
    private static int n;
    public static void fac(int n) 
    {
       for(int i=1;i<=n;i++)
          if(n%i==0){
          System.out.print(i +" ");}

          //System.out.println();
            
    }
    public static void main(String args[]) {
fac(100);        
    }
      
    }
