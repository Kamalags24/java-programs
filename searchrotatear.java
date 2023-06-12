public class searchrotatear {
    public static void  searchy(int[] n,int t) {
        int s=0,e=n.length-1;
        while(s<=e){
            int m=(s+e)/2;
            
            if(n[m]==t){System.out.println( m);}
            if(n[m]>=n[s]){
                if(n[m]>=t && n[s]<=t){
                    e=m-1;
                }
                else{s=m+1;}
             }
            else {
                if(t>=n[m] && t<=n[s]){
                    s=m+1;
                }
                else{e=m-1;}
            }
            }
            
            
        }
      
        public  static void main(String[] args) {
            int[] n={4,5,6,7,0,1,2};
           // System.out.println(
                searchy(n, 2);
        }
}
