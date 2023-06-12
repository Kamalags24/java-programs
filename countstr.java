public class countstr {
    public static int cout(String s){
        char[] d=s.toCharArray();
        int c=1,j=s.length();
        for(int i=0;i<j;i++){
            if(d[i]==' '){c++;}
        }
        return (c);
    }
    public static void main(String[] args) {
        System.out.println(cout("hi is smart boy jin has a comedy"));
    }
}
