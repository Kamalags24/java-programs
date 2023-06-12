public class hexatodec {
    public static void main(String[] args) {
        String hex="C9";
     
         System.out.println(check(hex));
    }

    public static int check(String hex) {
        
        String n="0123456789ABCDEF";
        var v=0;
        hex=hex.toUpperCase();
        for(int i=0;i<hex.length();i++){
            char c=hex.charAt(i);
            int d=n.indexOf(c);
             v=16*v+d;
        }return v;
    }
    
}
