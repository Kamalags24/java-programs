public class nonrepeatdigit {
    public static int non(int num) {
        int c=0,t,m=0;
        int a[]=new int[10];
        while(num>0){
            t=num%10;
            a[t]+=1;
            num/=10;
        }
        for(int i=0;i<=9;i++)
        if(a[i]==1){ 
            m+=i;
            c++;}
        return c;// for count 
        return m; //for adding

    }
    public static void main(String args[])
    {
        System.out.println(non(58422));
    }
}
