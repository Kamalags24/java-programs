public class hire{
    public static int findsum(int n,int[] arr){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=small(arr[i]);
        }
return sum;

    }
    public static int small(int n){
        int a=n%10;
        
    while(n!=0){
        int m=n%10;
        if(a>m){
            a=m;
        }
        n/=10;
    }
    return a;
    }
    public static void main(String[] args) {
        int[] a={23,56,45,342};
        System.out.println(findsum(4,a));
    }
}