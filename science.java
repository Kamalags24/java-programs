public class science {
    public static int[] lab(int[] n ) {
        int t,k;
        int[] s={1,1,1};

        for(int i=0;i<n.length;i++){
            if(i==0){
                s[i]=n[i];
                t=n[i];
            }
            else if(i==1){
                s[i]=s[0]*n[i];
            
            }
            else{
                s[i]=n[i]*s[1];
            }
        }
        return s;

        
    }
    public static void main(String[] args) {
        int[] i={5,3,3};
        int[] n=lab(i);
        for(int a:n){
            System.out.println(a);
        }
    }
}
