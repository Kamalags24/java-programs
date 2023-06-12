public class maxinarray {
    public static int sortee(int[] a) {
        int s=0,e=a.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(a[m]>a[m+1]){return a[m+1];}
            if(a[m]<a[m-1]){return a[m];}
            if(a[e]>a[m]){s=m+1;}
            if(a[e]<a[m]){e=m-1;}

        }
        return -1;
        
    }
    public  static void main(String[] args) {
        int[] n={4,5,6,7,0,1,2};
       // System.out.println(
        System.out.println(sortee(n));    }
}
 