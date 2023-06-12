public class pattern{
    public static void main(String[] args) {
        p3(5);
    }

    public static void p3(int n){
    
        for(int i=1;i<=2*n-1;i++){
            int c=i>n? 2*n -i :i;
            int space=n-c;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
               for(int j=1;j<=c;j++){
                System.out.print(j+" ");
              
               }
               System.out.println();
           
    }}
    public static void p1(int n) {
        for(int i=1;i<=2*n-1;i++){
         if(i<=n){
            for(int j=1;j<=i;j++){
               
              
                System.out.print(j);
               
            }
            System.out.println();
        }
        if(i>n){
            for(int j=1;j<=(2*n)-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

        
    }
    public static void p2(int n) {
        for(int i=1;i<=2*n;i++){
         if(i<=n){
            for(int j=1;j<=i;j++){
               
              
                System.out.print(j);
               
            }
            System.out.println();
        }
        if(i>n){
            for(int j=1;j<=(2*n)-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

        
    }
}