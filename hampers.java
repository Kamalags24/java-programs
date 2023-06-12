public class hampers {
    public static int giftcount(int k,int[] a) {
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]-a[j]==k || a[j]-a[i]==k){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] i={10,15,23,14,2,15};
        System.out.println(giftcount(13, i));
    }
}
