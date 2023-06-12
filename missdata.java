public class missdata {
    public static void data(String s1,String s2) {
        int l=s1.length()-s2.length();
     character c;
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int i=0;
         for( i=0;i<c1.length-1;i++){
             if(c1[i]!=c2[i]  ){
                 System.out.println(c1[i]);
                 break;
             }
         }
        // return c(
       
    }
    public static void main(String[] args) {
        data("abcdefghj", "abcdefgh");
    }
}
