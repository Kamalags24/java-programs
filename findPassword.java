public class findPassword{
    public static void main(String[] args) {
      int[] i={12,2,36,10,5,4,10,36,145,7};
       System.out.println(pass(i));
    }
    public static int pass(int[] input1) {
        String s="";
       int p1=higrep(input1);
       for(int i=0;i<input1.length;i++){
           if(input1[i]==p1){
               input1[i]=0;
           }
       }
       int p2=higrep(input1);
       int p3=low(input1);
       s+=p1;
       s+=p2;
       s+=p3;
    //  System.out.println(p1);
     return Integer.parseInt(s);
        
    }
    public static int  higrep(int in[]) {
      int  inn[]=new int[251];
      for(int i=0;i<in.length;i++){
          if(in[i]>0){
              inn[in[i]]++;
          }

      }
      int m=0,m1=0;
      for(int l=0;l<inn.length;l++)
{
    if(inn[l]>0){
        if(m<=inn[l]){
            m=inn[l];
            m1=l;
        }
    }
}
        return m1;
    }
    public static int  low(int in[]) {
        int[] inn=new int[251];
        for(int i=0;i<in.length;i++){
            if(in[i]>0){
                inn[in[i]]++;
            }
        }
        int m=9,m1=0;
        for(int k=0;k<inn.length;k++){
            if(inn[k]>0){
                if(inn[k]<m){
                    m=inn[k];
                    m1=k;
                }
            }
        }
return m1;
        
    }
}