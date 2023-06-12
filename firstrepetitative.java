public class firstrepetitative {
    public static int firstrep(int[] in) {
int[] inn=new int[in.length]; 
        for(int i=0;i<in.length;i++){
           
           for(int j=i+1;j<in.length;j++){

            if(in[i]==in[j]){
              int  k=0;
              while(in[i]>0){
                  inn[k]=in[i];
                  k++;
                  break;
              }
            }
        }}
        for(int i=0;i<in.length;i++){
           
            for(int j=i+1;j<in.length;j++){
 
             if(in[i]<=0){
return in[0];
             }
         }}

    return inn[0];
        
    }
    public static void main(String[] args) {
        int[] i={1,2,4,1,2,8};
       System.out.println(firstrep(i));
    }
}
