import java.util.*;
public class kshort {
    public static int shorts(int n,int k,int[] a) {
        Arrays.sort(a);
        return a[k-1];
        
    }
    public static int Shorts(int k,int[] a) 
        {
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]>a[j]){
                        
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
                    return a[k-1];
        }
        
    
    public static void main(String[] args) {
        int[] i={9,-3,8,-6,-7,18,10};
      System.out.println( Shorts(5 ,i));
    }
}
