public class datatrans {
    public static char digit(char c ,int n) {
        c=(char)(c+n);
        return c;        
    }public static void main(String[] args) {
        char b='k';
        char c=(char)(b+9);
        System.out.println(digit('z', 3));
    }
}
