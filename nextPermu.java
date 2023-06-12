public class nextPermu {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int i=a.length-2;
        while(i>=0 && a[i]>=a[i+1]){
            i--;
        }
        System.out.println(i);
    }
    
}
