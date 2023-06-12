public class armstrong {
    public static int len(int n) {
int c=0;
        while(n!=0)
        {c++;
            n/=10;

        }
        return c;
        
    }
    public static void arm(int num) {
       int t=0,k=num,r;
        while(num!=0){
            r=num%10;
            int s=(int)Math.pow(r, len(k));
    t=t+s;
    num/=10;
        }System.out.println(t);
    }
public static void main(String args[]) {
   
// System.out.println(arm(4545));
//System.out.println(l(4118546));

System.out.println( arms(370));
range(100, 1000);
}
public static void range(int l,int h) {
    int t,temp;
    for(int i=l;i<=h;i++){
        temp=i;
        t=arms(i);
        if(t==temp){
            System.out.print(t+" ");
        }


        }
    }

    



public static int l(int n) 
{
    int c=0;
    while(n>0){
        //t=n%10;
        c++;
        n/=10;
    }
    return c;
}
public static int arms(int n) 
{
    int t,m,j=n,h=0;
    while(n>0){
        t=n%10;
        m=(int)Math.pow(t, l(j));
        h+=m;
        n/=10;
    }
    return h;
}
}