public class uniquedigitcount {
    public static void main(String args[]){
        uni(215);
    }
    public static void uni(int num) {
        int t,c=0;
        int a[]={0,0,0,0,0,0,0,0,0,0};
        while(num!=0){
            t=num%10;
            if(a[t]==0){
                a[t]=1;
                c++;
               
            }
            

        num/=10;
        }
    
    System.out.println(c);}



        
    }
    
