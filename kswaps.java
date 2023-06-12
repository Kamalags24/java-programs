import java.util.*;
public class kswaps {
    public static void main(String[] args) 
    { 
        Scanner in=new Scanner(System.in); 
        int n =in.nextInt(); 
        int k =in.nextInt(); 
        int arr[]=new int[n]; 
     for (int i=0; i<n; ++i) {
    arr[i]=in.nextInt(); }


       minimizeWithKSwaps(arr, n, k); 
     
  /*  for(int j=0;j<n;j++){System.out.print(arr[j] +" "); 
     }*/
    }
    public static void minimizeWithKSwaps(int[] a,int n,int k) {
        int[] s=new int[n];
        s[0]=a[k];
        for(int i=1;i<n-1;i++){
           // if(i!=k){
            s[i]=a[i-1]; 
           

        }
        s[n-1]=a[n-1];
        for(int j=0;j<n;j++){System.out.print(s[j] +" "); 
     }
    } 
  public static void MinimiseWithKSwaps(int[] arr,int n,int k) {

    for (int i = 0; i < n-1 && k > 0; ++i) 
    { 
         int pos = i; 
        for (int j = i+1; j < n ; ++j) 
        { 
              if (j - i > k) 
                break; 
            if (arr[j] < arr[pos]) 
                pos = j; 
        } 
        int temp; 
          
        for (int j = pos; j>i; --j) 
        { 
            temp=arr[j]; 
            arr[j]=arr[j-1]; 
            arr[j-1]=temp; 
        } 
        k -= pos-i; 
    } 
  }
}
