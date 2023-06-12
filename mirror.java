public class mirror {
    public static int magic(String s1,String s2) {
        char c1[] =s1.toCharArray();
        char c2[]=s2.toCharArray();
        if(c1.length==c2.length){
               for(int i=0;i<c1.length;i++){
                   for(int j=0;j<c1.length;j++){
                       if(c1[i]==c2[j]){
                           c1[i]='0';
                           break;
                       }
                   }
               }
               if(isemp(c1)){
                   return 1;
               }
               else {
                   return -1;
               }
        }
        else 
          return -1;
        
    }
    public static boolean isemp(char[] c) {
        int p=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='0'){
                p++;
            }

        }
        if(p==c.length){
            return true;

        }
        else return false;
        
    }
    public static void main(String[] args) {
        System.out.println(magic("pakin", "nikpa"));
    }
}
