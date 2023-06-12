public class nonprimeindex {
    public static int nonprime(int[] n){
        int k=0;
        for(int i=0;i<n.length;i++){
            if(!prime(i)){
                k+=n[i];
            }

        }
        return k;
    }
    public static boolean prime(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }

        }
        if(c==2){
            return true;
        }
        else 
        return false;
        
    }
    public static void main(String[] args) {
        int[] i={10,20,30,40,50,60,70,80,90,100};
        System.out.println(nonprime(i));
        
    }
}
