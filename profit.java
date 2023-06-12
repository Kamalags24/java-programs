public class profit {
    public static int small(int[] n) {
        int c=n[0];
        
        for(int i=0;i<n.length;i++){
            if(c>n[i]){
                c=n[i];
            }
        }
        return c; 
        
    }
    public static int smalli(int[] n) {
        int c=n[0];
        int j=0;
        for(int i=1;i<n.length;i++){
            if(c>n[i]){
                c=n[i];
                j=i;
            }
        }
        return j; 
        
    }
    public static int pro(int[] n) {
        int i=smalli(n);
        int c=0;
        if(i!=n.length-1){
        for(int j=i;j<n.length-1;j++){
            if(n[j]<n[j+1]){
                c=n[j+1];
            }
            
            else{
                c=n[j];
            }
            
           
        }
        return c-n[smalli(n)]; }
        else  return small(n)-small(n);
        
    }
    public static int name(int[] n) {
        int buy=n[0];
        int sell=0;
        for(int i=0;i<n.length;i++){
            if(buy>n[i]){
                buy=n[i];
            }
            else if(buy-n[i]<sell){
                sell=buy-n[i];
            }
        }
return -sell;
    }
    public static void main(String[] args) {
        int p[]={7,1,5,3,6,4};
System.out.println(name(p));

}
}
