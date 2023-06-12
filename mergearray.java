public class mergearray{
    public static void  mergesort(int[] a,int[] b,int c,int d ){
        int i=c-1,j=d-1,m=a.length-1;
        while(i>=0 && j>=0){
            if(a[i]<=b[j]){
                a[m]=b[j];
                m--;
                j--;
            }
            else{
                a[m]=a[i];
                i--;
                m--;
            }
        }
      
        while(i>=0){
            a[m]=a[i];
            i--;
            m--;
        }
        while(j>=0){
            a[m]=b[j];
            j--;
            m--;
        }
        for (int t:a){
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,0,0,0,0};
        int[] b={1,2,5,6};
        int c=3,d=4;
        mergesort(a, b, c, d);
    }
}