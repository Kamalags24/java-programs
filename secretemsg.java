public class secretemsg {
    public static int count(String s) {
        char[] a=s.toCharArray();
        int c=0;
        for(int i=0;i<a.length;i++){
            if(!(a[i]>='a' && a[i]<='z' || a[i]>='A' && a[i]<='Z' || a[i]>='0' && a[i]<='9')){
                c++;
            }

        
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(count("abscf2@!#@jkojk"));
    }
}
