public class no_of_digit{
    public static int count(int n) {
        int c=0,k;
        while(n!=0)
        {   if(n!=0){
            k=n%10;
            c++;
        }
            n/=10;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(count(12345));
    }
}