public class pooled{
    public static int[] pooled(int n,int s,int e,int[] a) {
        
         int c=0;
        for(int i=0;i<n;i++){
            if(a[i]>=s && a[i]<=e){
                c++;
            }
        }
        int[] p=new int[c];
        int k=0;
        for(int i=0;i<n;i++){
            if(a[i]>=s && a[i]<=e){
                p[k]=a[i];
           
           k++; }
        }
        return p;
       
    }
    public static void main(String[] args) {
        int[] i={29,38,12,48,39,55};
       // System.out.println(pooled(6, 29, 50, i));
       int[] o=pooled(6, 30, 50, i);
        for(int j=0;j<o.length;j++){
            System.out.println(o[j]+" ");
        }
    }
}